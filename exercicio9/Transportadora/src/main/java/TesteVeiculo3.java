import encapsulamento.versao3.Veiculo;

public class TesteVeiculo3 {
    public static void main(String[] args) {
        Veiculo cargas = new Veiculo(10000.0);

        System.out.println("Criando um veículo com carga máxima de " + cargas.getCargaMax() + "kg");
        System.out.println("Adicionando Caixa número 1: (500kg) :" + cargas.adicionarCaixa(500.0));
        System.out.println("Adicionando Caixa número 2: (250kg) :" + cargas.adicionarCaixa(250.0));
        System.out.println("Adicionando Caixa número 3: (5000kg) :" + cargas.adicionarCaixa(5000.0));
        System.out.println("Adicionando Caixa número 4: (4000kg) :" + cargas.adicionarCaixa(4000.0));
        System.out.println("Adicionando Caixa número 5: (300kg) :" + cargas.adicionarCaixa(300.0));
        System.out.println("A carga do veículo é: " + cargas.getCarga() + "kg");
    }
}
