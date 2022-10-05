export class Banco {
    #clientes;

    // Constructor Singleton
    constructor() {
        if(!Banco.instance) {
            this.#clientes = new Set();
            Banco.instance = this;
        }
        return Banco.instance;
    }

    get clientes() {
        return this.#clientes;
    }

    adicionarCliente(cliente) {
        this.#clientes.add(cliente);
    }
    getClientesNome(nome, sobrenome) {
        let correspondencias = new Set();
        for(let c of this.#clientes) {
            if(c.nome === nome && c.sobrenome === sobrenome) {
                correspondencias.add(c);
            }
        }
        return correspondencias;
    }
    getNumeroClientes(){
        return this.#clientes.size;
    }
}