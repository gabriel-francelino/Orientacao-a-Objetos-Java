package exercicio1;

public class TestePonto {
    public static void main(String[] args) {
        Ponto primeiroPonto = new Ponto();
        Ponto segundoPonto = new Ponto(400, 230);

        System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

        Ponto outraRefSegundoPonto = segundoPonto;

        System.out.println("\nCriação de outra referência para o segundo ponto, chamada de outraRefSegundoPonto");
        System.out.println("\nExibindo o conteúdo de todas referências\n");
        System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): (" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");

        outraRefSegundoPonto.setX(840);
        outraRefSegundoPonto.setY(350);

        System.out.println("\nAlterando as coordenadas do segundo ponto para (840,350)\n");
        System.out.println("Coordenadas do primeiro ponto (x,y): (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto (x,y): (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y): (" + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");



    }
}
