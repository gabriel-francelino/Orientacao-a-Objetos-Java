package banco;

public class TesteBanco {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        conta.sacar(250);
        conta.depositar(320.5);
        conta.sacar(120);
        System.out.println("O saldo da conta é R$" + conta.getSaldo());
    }
}
