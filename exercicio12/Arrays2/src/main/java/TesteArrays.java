
import java.util.Arrays;

public class TesteArrays {
    public static void main(String[] args) {
        int [] array1 = {2,3,5,7,11,13,17,19};
        int [] array2;

        System.out.println("Imprimindo array1, array2, e matriz usando métodos estáticos da classe Arrays");
        System.out.println(Arrays.toString(array1));

        array2 = array1;
        array2[0] = 0;
        array2[2] = 2;
        array2[4] = 4;
        array2[6] = 6;

        System.out.println(Arrays.toString(array2));


        //usando arrays multidimensionais--------------------------------------

        int [][] matriz = new int[5][];

        for (int i=0; i<matriz.length; i++){
            matriz[i] = new int[i];
            for (int j=0; j<i; j++){
                matriz[i][j] = i*j;
            }

        }

        System.out.println(Arrays.deepToString(matriz));


    }

//    public static void exibirArray(int[] array) {
//        System.out.print("<");
//        for (int i = 0; i < array.length; i++) {
//            // Imprime um elemento
//            System.out.print(array[i]);
//            // Imprime uma vírgula como delimitador se não for o
//            // último elemento
//            if ((i+1) < array.length) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print(">");
//        System.out.println();
//    }
}
