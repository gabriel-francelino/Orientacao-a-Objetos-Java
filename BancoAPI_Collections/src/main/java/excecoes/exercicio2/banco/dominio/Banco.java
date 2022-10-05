package excecoes.exercicio2.banco.dominio;

import java.util.*;

public class Banco {
    private Set<Cliente> clientes;
    /*
    o acesso aos dados é mais rápido que em um TreeSet,
    mas nada garante que os dados estarão ordenados.
    Escolha este conjunto quando a solução exigir elementos
    únicos e a ordem não for importante.
     */
    private static final Banco banco = new Banco();

    private Banco() {
        clientes = new HashSet<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Iterator<Cliente> getClientes() {
        return clientes.iterator();
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }

    public HashSet<Cliente> getCliente(String nome, String sobrenome) {
        HashSet<Cliente> result = new HashSet<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) &&
                    cliente.getSobrenome().equals(sobrenome)) {
                result.add(cliente);
            }
        }
        return result;
    }

    public static Banco getBanco() {
        return banco;
    }
}
