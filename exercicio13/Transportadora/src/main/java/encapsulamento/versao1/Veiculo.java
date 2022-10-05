package encapsulamento.versao1;

public class Veiculo {
    public double carga;
    public double cargaMax;

    public Veiculo(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMax() {
        return cargaMax;
    }
}
