import { Banco } from "../model/Banco.js";
import { ContaCorrente } from "../model/ContaCorrente.js";
import { ContaPoupanca } from "../model/ContaPoupanca.js";

import { escreverLinha } from "../view/InterfaceBanco.js";

export class Relatorio {
    // Mostra o resultado da lista de clientes com mesmo nome encontrada
    resultadoClientes(clientes) {
        escreverLinha("Temos " + clientes.size + " cliente(s) com o nome fornecido.");
        let i = 0;
        let tipoConta = "";

        clientes.forEach(cliente => {
            i++;
            escreverLinha("\nCliente " + i + "...: " + cliente.nome + " " + cliente.sobrenome);
            cliente.contas.forEach(conta => {
                if(conta instanceof ContaPoupanca) {
                    tipoConta = "Conta Poupança";
                } else if(conta instanceof ContaCorrente) {
                    tipoConta = "Conta Corrente";
                } else {
                    tipoConta = "Conta Desconhecida";
                }
                escreverLinha("\tTipo de conta: " + tipoConta + " com saldo de " + conta.saldo.toLocaleString('pt-br', {style: 'currency', currency: 'BRL'}));
            });
        });
    }
    // Simula buscas por clientes pelo nome e sobrenome, e para cada busca mostra os clientes encontrados
    criarRelatorioBusca() {
        const banco = new Banco();
        let clientes;

        escreverLinha("\n\n==============================================================");
        escreverLinha("\t\t\t\t\tRESULTADO DA BUSCA");
        escreverLinha("==============================================================");

        escreverLinha("Nome fornecido para busca...: Bilbo Bolseiro");
        clientes = banco.getClientesNome("Bilbo", "Bolseiro");
        this.resultadoClientes(clientes);

        escreverLinha("\n==============================================================");

        escreverLinha("Nome fornecido para busca...: Samwise Gamgee");
        clientes = banco.getClientesNome("Samwise", "Gamgee");
        this.resultadoClientes(clientes);

        escreverLinha("\n==============================================================");

        escreverLinha("Nome fornecido para busca...: Frodo Bolseiro");
        clientes = banco.getClientesNome("Frodo", "Bolseiro");
        this.resultadoClientes(clientes);

        escreverLinha("\n==============================================================");

        escreverLinha("Nome fornecido para busca...: Thorin Oakenshield");
        clientes = banco.getClientesNome("Thorin", "Oakenshield");
        this.resultadoClientes(clientes);
        escreverLinha("\n==============================================================");
    }

    // Simula transações para 2 clientes fornecidos
    simularTransacoes(c1, c2) {
        let conta;

        escreverLinha("\n\n==============================================================");
        escreverLinha("\t\t\t\t\tSIMULADOR DE TRANSAÇÕES");
        escreverLinha("==============================================================");

        escreverLinha("\nTransações do Cliente " + c1.nome + " na conta " + c1.getConta(0).numeroConta);
        conta = c1.getConta(0);
        try {
            escreverLinha("Sacando R$ 1.200,00");
            conta.sacar(1200);
            escreverLinha("Depositando R$ 8.525,00");
            conta.depositar(8525);
            escreverLinha("Sacando R$ 300.000,00");
            conta.sacar(300000);
            escreverLinha("Sacando R$ 50.000,00: ");
            conta.sacar(50000);
        } catch (err) {
            escreverLinha("Falha na operação. Exceção: " + err.message + " Déficit: " + err.deficit.toLocaleString('pt-br', {style: 'currency', currency: 'BRL'}));
        }

        escreverLinha("\n==============================================================");

        escreverLinha("\nTransações do Cliente " + c2.nome + " na conta " + c2.getConta(0).numeroConta);
        conta = c2.getConta(0);
        try {
            escreverLinha("Sacando R$ 15500.00");
            conta.sacar(15500.00);
            escreverLinha("Depositando R$ 3000.00");
            conta.depositar(3000.00);
            escreverLinha("Sacando de R$ 18000.00");
            conta.sacar(18000.00);
        } catch (err) {
            escreverLinha("Falha na operação. Exceção: " + err.message + " Déficit: " + err.deficit.toLocaleString('pt-br', {style: 'currency', currency: 'BRL'}));
        } 
        escreverLinha("\n==============================================================");
    }

    // Cria um relatório completo com todos os clientes criados
    criarRelatorio() {
        escreverLinha("\n==============================================================");
        escreverLinha("\t\t\t\t\tRELATÓRIO DE CLIENTES");
        escreverLinha("==============================================================");
        const banco = new Banco();
        banco.clientes.forEach(c => {
            c.exibirCliente();
            escreverLinha("\n==============================================================");
        });
    }
}