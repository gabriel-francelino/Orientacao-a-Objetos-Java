import { Conta } from "./Conta.js";

export class ContaPoupanca extends Conta {
    #taxaRendimento;

    constructor(saldoInicial, numeroConta, rendimento) {
        super(saldoInicial, numeroConta);
        this.#taxaRendimento = rendimento;
    }

    get taxaRendimento(){
        return this.#taxaRendimento;
    }
}