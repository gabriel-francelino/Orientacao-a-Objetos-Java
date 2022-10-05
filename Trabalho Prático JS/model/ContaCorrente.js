import { Conta } from "./Conta.js";
import { ExcecaoChequeEspecial } from "../errors/ExcecaoChequeEspecial.js";

export class ContaCorrente extends Conta {
    #chequeEspecial;

    constructor(saldoInicial, numeroConta, chequeEspecial) {
        super(saldoInicial, numeroConta);
        this.#chequeEspecial = chequeEspecial;
    }
    
    sacar(valor){
        if(valor <= (this.saldo + this.#chequeEspecial)) {
            this.saldo = (this.saldo - valor);
        } else if (this.#chequeEspecial == 0) {
            throw new ExcecaoChequeEspecial("Não há cheque especial.", valor - this.saldo);
        } else {
            throw new ExcecaoChequeEspecial("Cheque especial insuficiente.", valor - this.saldo);
        }
    }
}