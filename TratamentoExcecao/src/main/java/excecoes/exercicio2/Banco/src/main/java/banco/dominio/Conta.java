package excecoes.exercicio2.Banco.src.main.java.banco.dominio;

import excecoes.exercicio2.Banco.src.main.java.banco.dominio.excecoes.ExcecaoChequeEspecial;

public class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial {
        if ((this.saldo  - valor) >= 0) {
            saldo = saldo - valor;
        }else
            throw new ExcecaoChequeEspecial("Saldo insuficiente",saldo - valor);
    }


}
