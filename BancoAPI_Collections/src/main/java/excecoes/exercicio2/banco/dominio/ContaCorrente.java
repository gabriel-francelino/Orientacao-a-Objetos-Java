package excecoes.exercicio2.banco.dominio;

import excecoes.exercicio2.banco.dominio.excecoes.ExcecaoChequeEspecial;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial {
        // Saldo + valor cheque especial suficientes para cobrir o saque
        if (this.saldo + this.chequeEspecial > valor) {
            this.saldo -= valor;
        }
        else if (this.chequeEspecial <= 0.0){
            throw new ExcecaoChequeEspecial("Não há cheque especial.", valor-saldo);
        }
        else if (this.saldo + this.chequeEspecial < valor) {
            throw new ExcecaoChequeEspecial("Saldo insuficiente no cheque especial", valor - saldo);
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


}
