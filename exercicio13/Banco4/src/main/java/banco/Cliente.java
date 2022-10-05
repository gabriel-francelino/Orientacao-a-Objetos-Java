package banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;

    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    Conta conta;

    private ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Conta getConta() {
        return conta;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public Conta getConta(int id) {
        return contas.get(id);
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getNumeroDeContas(){
        return contas.size();
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
