package encapsulamento.versao3;

public class Veiculo {
    private double carga;
    private double cargaMax;

    public Veiculo(double cargaMax) {
        this.cargaMax = quilosParaNewtons(cargaMax);
    }

    public double getCarga() {
        return newtonsParaQuilos(carga);
    }

    public double getCargaMax() {
        return newtonsParaQuilos(cargaMax);
    }

    public boolean adicionarCaixa(double peso){
        double n = quilosParaNewtons(peso);
        if (n+carga<=cargaMax){
            carga = carga + n;
            return true;
        }
        return false;
    }

    private double newtonsParaQuilos(double peso){
        double kg;
        kg = peso/9.8;
        return kg;
    }

    private double quilosParaNewtons(double peso){
        double n;
        n = peso * 9.8;
        return n;
    }
}
