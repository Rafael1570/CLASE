import java.util.Scanner;

public class Ejercicio839 {

    public static int encontrarMaximo(int[] array1) {
        int max = array1[0]; // empezamos por el primer elemento

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 12, 4, 8};

        int max = encontrarMaximo(array1);

        System.out.println("El máximo es: " + max);
    }
}
