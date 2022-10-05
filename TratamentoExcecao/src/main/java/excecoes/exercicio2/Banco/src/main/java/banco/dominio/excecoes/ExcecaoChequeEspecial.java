package excecoes.exercicio2.Banco.src.main.java.banco.dominio.excecoes;

public class ExcecaoChequeEspecial extends Exception{
    private double defict;

    public ExcecaoChequeEspecial(String mensagem, double defict){
        super(mensagem);
        this.defict = defict;
    }

    public double getDeficit() {
        return defict;
    }
}
