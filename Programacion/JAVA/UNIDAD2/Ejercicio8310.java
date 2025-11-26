import java.util.Arrays;

public class Ejercicio8310 {

    public static int[] invertirArray(int[] array1) {
        int tamaño = array1.length;
        int[] alreves = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            alreves[i] = array1[tamaño - 1 - i];  
        }

        return alreves;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        
        int[] arrayInvertido = invertirArray(array1);
        
        System.out.println("El Array inverso es: " + Arrays.toString(arrayInvertido));
    }
}
