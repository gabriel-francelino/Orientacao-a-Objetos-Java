package banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> cliente = new ArrayList<>();

    public Banco() {

    }

    public void adicionarCliente(Cliente cliente){
        this.cliente.add(cliente);
    }

    public Cliente getCliente(int indice) {
        return this.cliente.get(indice);
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome){
        return cliente;
    }

    public int getNumeroDeClientes(){
        return this.cliente.size();
    }
}
