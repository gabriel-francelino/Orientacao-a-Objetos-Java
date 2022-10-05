package banco;

public class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor<=saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

}
