package banco;

import banco.*;
public class TesteBanco {
    public static void main(String[] args) {

        ContaPoupanca conta1 = new ContaPoupanca(50000,3);
        Cliente cliente1 = new Cliente("Bruno", "Henrique");
        cliente1.setConta(conta1);
        System.out.println(reportPoupanca(cliente1,3));

        ContaCorrente conta2 = new ContaCorrente(45000,30000);
        Cliente cliente2 = new Cliente("Everton", "Ribeiro");
        cliente2.setConta(conta2);
        System.out.println(reportCorrente(cliente2,30000));

        ContaCorrente conta3 = new ContaCorrente(70000);
        Cliente cliente3 = new Cliente("Filipe", "Luis");
        cliente3.setConta(conta3);
        System.out.println(reportCorrente(cliente3,0));

        ContaPoupanca conta4 = new ContaPoupanca(220000,3);
        Cliente cliente4 = new Cliente("Gabriel", "Barbosa");
        cliente4.setConta(conta4);
        System.out.println(reportPoupanca(cliente4, 3));

        ContaCorrente conta5 = new ContaCorrente(50000);
        Cliente cliente5 = new Cliente("Diego", "Alves");
        cliente5.setConta(conta5);
        System.out.println(reportCorrente(cliente5,0));

        ContaCorrente conta6 = conta5;
        Cliente cliente6 = new Cliente("Lorena","Lara");
        cliente6.setConta(conta6);
        System.out.println("Diego Alves altorizou o cadastro da sua conta corrente sendo conjunta com o cliente Lorena Lara");


        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);
        banco.adicionarCliente(cliente4);
        banco.adicionarCliente(cliente5);
        banco.adicionarCliente(cliente6);

        System.out.println("\n-----------------------RELATÓRIO DE TRANSAÇÕES-------------------");
        System.out.println("Recuperando o cliente " + cliente1.getNome() + " " + cliente1.getSobrenome());
        System.out.println(sacando(cliente1,1200));
        System.out.println(depositando(cliente1,8825));
        System.out.println(sacando(cliente1,12800));
        System.out.println(sacando(cliente1,50000));
        System.out.println("Cliente [" + cliente1.getNome() + "," + cliente1.getSobrenome() + "] tem salde de R$ "+ cliente1.getConta().getSaldo());
        System.out.println();

        System.out.println("Recuperando o cliente " + cliente2.getNome() + " " + cliente2.getSobrenome());
        System.out.println(sacando(cliente2,12500));
        System.out.println(sacando(cliente2,18500));
        System.out.println(depositando(cliente2,3500));
        System.out.println(sacando(cliente2,17000));
        System.out.println(sacando(cliente2,25000));
        System.out.println("Cliente [" + cliente2.getNome() + "," + cliente2.getSobrenome() + "] tem salde de R$ "+ cliente2.getConta().getSaldo());
        System.out.println();

        System.out.println("Recuperando o cliente " + cliente3.getNome() + " " + cliente3.getSobrenome());
        System.out.println(sacando(cliente3,25500));
        System.out.println(depositando(cliente3,2000));
        System.out.println(sacando(cliente3,37200));
        System.out.println(sacando(cliente3,15000));
        System.out.println("Cliente [" + cliente3.getNome() + "," + cliente3.getSobrenome() + "] tem salde de R$ "+ cliente3.getConta().getSaldo());
        System.out.println();

        System.out.println("Recuperando o cliente " + cliente4.getNome() + " " + cliente4.getSobrenome());
        System.out.println(sacando(cliente4,15500));
        System.out.println(depositando(cliente4,3000));
        System.out.println(sacando(cliente4,23400));
        System.out.println(sacando(cliente4,17000));
        System.out.println("Cliente [" + cliente4.getNome() + "," + cliente4.getSobrenome() + "] tem salde de R$ "+ cliente4.getConta().getSaldo());
        System.out.println();

        System.out.println("Recuperando o cliente " + cliente5.getNome() + " " + cliente5.getSobrenome());
        System.out.println(sacando(cliente5,28000));
        System.out.println(depositando(cliente5,3000));
        System.out.println(sacando(cliente5,17000));
        System.out.println("Cliente [" + cliente5.getNome() + "," + cliente5.getSobrenome() + "] tem salde de R$ "+ cliente5.getConta().getSaldo());
        System.out.println();

        System.out.println("Recuperando o cliente " + cliente6.getNome() + " " + cliente6.getSobrenome());
        System.out.println(sacando(cliente6,32000));
        System.out.println(depositando(cliente6,13000));
        System.out.println(sacando(cliente6,16600));
        System.out.println("Cliente [" + cliente6.getNome() + "," + cliente6.getSobrenome() + "] tem salde de R$ "+ cliente6.getConta().getSaldo());
        System.out.println();

    }

    public static String reportPoupanca(Cliente c, int rend){
        String retorno;
        if (rend == 0){
            retorno = "Criando uma conta poupança para " + c.getNome() + " " + c.getSobrenome() + " com saldo de R$" + c.getConta().getSaldo() + " e sem taxa de rendimento.";

        }else
            retorno = "Criando uma conta poupança para " + c.getNome() + " " + c.getSobrenome() + " com saldo de R$" + c.getConta().getSaldo() + " e taxa de rendimento de " + rend + "%.";
        return retorno;
    }

    public static String reportCorrente(Cliente c, int chequeEspecial){
        String retorno;
        if (chequeEspecial == 0){
            retorno = "Criando uma conta poupança para " + c.getNome() + " " + c.getSobrenome() + " com saldo de R$" + c.getConta().getSaldo() + " e sem cheque especial.";

        }else
            retorno = "Criando uma conta poupança para " + c.getNome() + " " + c.getSobrenome() + " com saldo de R$" + c.getConta().getSaldo() + " e cheque especial de " + chequeEspecial + ".";
        return retorno;
    }

    public static String sacando(Cliente c, double d){
        String retorno = "Sacando R$ " + d + ": " + c.getConta().sacar(d);
        return retorno;
    }

    public static String depositando(Cliente c, double d){
        String retorno = "Depositando R$ " + d + ": " + c.getConta().depositar(d);
        return retorno;
    }

}




