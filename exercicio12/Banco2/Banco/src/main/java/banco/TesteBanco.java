package banco;

import banco.*;
public class TesteBanco {
    public static void main(String[] args) {
        Conta conta1 = new Conta(50000);
        Conta conta2 = new Conta(45000);
        Conta conta3 = new Conta(70000);
        Conta conta4 = new Conta(220000);
        Conta conta5 = new Conta(50000);

        Cliente cliente1 = new Cliente("Bruno", "Henrique");
        cliente1.setConta(conta1);
        Cliente cliente2 = new Cliente("Everton", "Ribeiro");
        cliente2.setConta(conta2);
        Cliente cliente3 = new Cliente("Filipe", "Luis");
        cliente3.setConta(conta3);
        Cliente cliente4 = new Cliente("Gabriel", "Barbosa");
        cliente4.setConta(conta4);
        Cliente cliente5 = new Cliente("Diego", "Alves");
        cliente5.setConta(conta5);

        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);
        banco.adicionarCliente(cliente4);
        banco.adicionarCliente(cliente5);


        for (int i=0; i<5; i++){
            banco.getCliente(i);
            System.out.print("Cliente [" + (i+1) + "] : " + banco.getCliente(i).getNome() + " "
                                                     + banco.getCliente(i).getSobrenome() + " Saldo R$"
                                                     + banco.getCliente(i).getConta().getSaldo() + "\n");
        }
    }
}
