import encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {
    public static void main(String[] args) {
        Veiculo caixa1 = new Veiculo(10000.0);
        caixa1.carga = 500.0;

        Veiculo caixa2 = new Veiculo(10000.0);
        caixa2.carga = 250.0;

        Veiculo caixa3 = new Veiculo(10000.0);
        caixa3.carga = 5000.0;

        Veiculo caixa4 = new Veiculo(10000.0);
        caixa4.carga = 4000.0;

        Veiculo caixa5 = new Veiculo(10000.0);
        caixa5.carga = 300.0;

        System.out.println("Criando um veículo com carga máxima de 10000kg.");
        System.out.println("Adicionando Caixa número 1: " + caixa1.carga);
        System.out.println("Adicionando Caixa número 2: " + caixa2.carga);
        System.out.println("Adicionando Caixa número 3: " + caixa3.carga);
        System.out.println("Adicionando Caixa número 4: " + caixa4.carga);
        System.out.println("Adicionando Caixa número 5: " + caixa5.carga);
        System.out.println("A carga do veículo é: " + (caixa1.carga+caixa2.carga+caixa3.carga+caixa4.carga+caixa5.carga));
    }
}
