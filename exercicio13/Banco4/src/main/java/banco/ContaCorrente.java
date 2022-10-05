package banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;
    private ContaPoupanca protecaoContaPoupanca;

    public ContaCorrente(double saldoInicial ,double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial, ContaPoupanca protecao){
        super(saldoInicial);
        protecaoContaPoupanca = protecao;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);

    }

    @Override
    public boolean sacar(double valor){
        if(valor<= saldo && valor>=0){
            saldo = saldo - valor;
            return true;
        } else if (protecaoContaPoupanca != null && valor > saldo && valor < (saldo + protecaoContaPoupanca.saldo)) {
            double diferenca = valor - saldo;
            protecaoContaPoupanca.saldo = protecaoContaPoupanca.saldo - diferenca;
            saldo = 0;
            return true;
        }
        return false;
    }

}
