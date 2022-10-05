package banco;

import banco.*;
public class TesteBanco {
    public static void main(String[] args) {
        Conta conta = new Conta(50000);

        Cliente cliente1 = new Cliente("Bruno", "Henrique");
        System.out.println("Criando o cliente " + cliente1.getNome() + " " + cliente1.getSobrenome());

        System.out.println("Criando conta com saldo de 50.000,00 para o cliente Bruno Henrique.");
        cliente1.setConta(conta);

        System.out.println("Sacando R$ 1.200,00: " + cliente1.conta.sacar(1200));
        System.out.println("Depositando R$ 8.525,00: " + cliente1.conta.depositar(8525));
        System.out.println("Sacando R$ 12.800,00: " + cliente1.conta.sacar(12800));
        System.out.println("Sacando R$ 50.000,00: " + cliente1.conta.sacar(50000));


        System.out.println("O saldo da conta é R$ " + cliente1.conta.getSaldo());
    }
}
