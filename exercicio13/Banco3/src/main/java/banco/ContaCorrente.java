package banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(double saldoInicial ,double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);

    }

    @Override
    public boolean sacar(double valor){
        if(valor< saldo + chequeEspecial){
            if ((saldo-valor) > (-1*chequeEspecial)){
                saldo = saldo - valor;
                return true;
            }
            return false;
        } else if (valor > saldo + chequeEspecial) {
            return false;
        }
        return false;
    }
}
