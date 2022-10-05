import encapsulamento.versao2.Veiculo;

public class TesteVeiculo2 {
    public static void main(String[] args) {
        Veiculo cargas = new Veiculo(10000.0);
        boolean resultado = false;

        System.out.println("Criando um veículo com carga máxima de " + cargas.getCargaMax() + "kg");
        resultado = cargas.adicionarCaixa(500.0);
        if (resultado){
            System.out.println("Adicionando Caixa número 1: (500kg)" + resultado);
        }
        resultado = cargas.adicionarCaixa(250.0);
        if (resultado){
            System.out.println("Adicionando Caixa número 2: (250kg)" + resultado);
        }
        resultado = cargas.adicionarCaixa(5000.0);
        if (resultado){
            System.out.println("Adicionando Caixa número 3: (5000kg)" + resultado);
        }
        resultado = cargas.adicionarCaixa(4000.0);
        if (resultado){
            System.out.println("Adicionando Caixa número 4: (4000kg)" + resultado);
        }
        resultado = cargas.adicionarCaixa(300.0);
        if (resultado){
            System.out.println("Adicionando Caixa número 5: (300kg)" + resultado);
        }
        System.out.println("A carga do veículo é: " + cargas.getCarga());



    }
}
