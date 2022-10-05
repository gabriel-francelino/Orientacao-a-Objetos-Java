package banco;

public class Banco {
    private Cliente [] cliente;
    private int numeroDeClientes;

    public Banco() {
        cliente = new Cliente[5];
    }

    public void adicionarCliente(Cliente cliente){
        this.cliente[numeroDeClientes] = cliente;
        numeroDeClientes++;
    }

    public Cliente getCliente(int indice) {
        return this.cliente[indice];
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }
}
