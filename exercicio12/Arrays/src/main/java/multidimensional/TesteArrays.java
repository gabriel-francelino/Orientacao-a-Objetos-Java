package multidimensional;

public class TesteArrays {
    public static void main(String[] args) {


        //usando arrays multidimensionais--------------------------------------

        int [][] matriz = new int[5][];

        System.out.println("Imprimindo matriz");
        for (int i=0; i<matriz.length; i++){
            matriz[i] = new int[i];
            for (int j=0; j<i; j++){
                matriz[i][j] = i*j;
            }
            exibirArray(matriz[i]);
        }


    }

    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            // Imprime um elemento
            System.out.print(array[i]);
            // Imprime uma vírgula como delimitador se não for o
            // último elemento
            if ((i+1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
        System.out.println();
    }
}
