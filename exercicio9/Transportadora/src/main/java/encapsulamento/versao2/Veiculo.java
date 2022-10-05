package encapsulamento.versao2;

public class Veiculo {
    private double carga;
    private double cargaMax;

    public Veiculo(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public boolean adicionarCaixa(double peso){
        if (peso+carga<=cargaMax){
            carga = carga + peso;
            return true;
        }
        return false;
    }
}
