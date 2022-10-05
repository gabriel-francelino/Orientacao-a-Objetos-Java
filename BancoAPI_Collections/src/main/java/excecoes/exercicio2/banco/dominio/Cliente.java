package excecoes.exercicio2.banco.dominio;

import java.util.*;


public class Cliente {
    private String nome;
    private String sobrenome;
    private List<Conta> contas;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contas = new ArrayList<>();
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

    public Conta getConta(int indice) {
        return contas.get(indice);
    }

    public Iterator<Conta> getContas(){
        return contas.iterator();
    }

    public int getNumeroDeContas() {
        return contas.size();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }


}
