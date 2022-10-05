export class ExcecaoChequeEspecial extends Error {
    #deficit;

    constructor(mensagem, deficit) {
        super(mensagem);
        this.#deficit = deficit;
    }

    get deficit() {
        return this.#deficit;
    }
}