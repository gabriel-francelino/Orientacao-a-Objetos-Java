package banco;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        System.out.println("Criando uma conta com saldo de R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){
        saldo+= valor;
        System.out.println("Depositando R$" + valor);
        return saldo;
    }

    public double sacar(double amount){
        saldo-=amount;
        System.out.println("Sacando R$" + amount);
        return saldo;
    }
}
