import { ContaCorrente } from "../model/ContaCorrente.js";
import { ContaPoupanca } from "../model/ContaPoupanca.js";
import { escreverLinha } from "../view/InterfaceBanco.js";

export class Cliente {
    #cpf;
    #nome;
    #sobrenome;
    #contas;

    constructor(nome, sobrenome, cpf) {
        this.#nome = nome;
        this.#sobrenome = sobrenome;
        this.#cpf = cpf;
        this.#contas = new Array();
    }

    // Getter & Setters
    get nome(){
        return this.#nome;
    }
    set nome(nome) {
        this.#nome = nome;
    }

    get sobrenome(){
        return this.#sobrenome;
    }
    set sobrenome(sobrenome) {
        this.#sobrenome = sobrenome;
    }

    get contas(){
        return this.#contas
    }

    // Methods
    adicionarConta(conta) {
        this.#contas.push(conta);
    }
    getConta(indice) {
        return this.#contas[indice];
    }
    getNumeroContas() {
        return this.#contas.length;
    } 
    exibirCliente() {
        escreverLinha("\nCliente [" + this.#nome + ", " + this.sobrenome + "]" + " possui " + this.getNumeroContas() + " conta(s).");
        let tipoConta;
        let i = 0;
        this.contas.forEach(conta => {
            i++;
            if(conta instanceof ContaPoupanca) {
                tipoConta = "Conta Poupança";
            } else if(conta instanceof ContaCorrente) {
                tipoConta = "Conta Corrente";
            } else {
                throw new Error("Conta não reconhecida.");
            }
            escreverLinha("\tConta " + i  + ": " + tipoConta + " com saldo de " + conta.saldo.toLocaleString('pt-br', {style: 'currency', currency: 'BRL'}));
        })
    }
}
