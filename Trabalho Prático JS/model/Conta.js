export class Conta {
    #numeroConta;
    #saldo;

    constructor(saldo, numeroConta) {
        if(this.constructor === Conta) {
            throw new Error("A classe Conta não pdoe ser instanciada.")
        }
        this.#numeroConta = numeroConta;
        this.#saldo = saldo;
    }

    get saldo() {
        return this.#saldo;
    }
    set saldo(saldo) {
        this.#saldo = saldo;
    }

    get numeroConta(){
        return this.#numeroConta;
    }

    depositar(valor){
        if(valor > 0) {
            this.#saldo += valor;
            return true;
        }
        return false;
    }
    sacar(amount) {
        if(amount <= this.saldo && amount >= 0) {
            this.saldo -= amount;
        } else {
            throw new ExcecaoChequeEspecial("Saldo Insuficiente", (amount - saldo));
        }
    }
}
