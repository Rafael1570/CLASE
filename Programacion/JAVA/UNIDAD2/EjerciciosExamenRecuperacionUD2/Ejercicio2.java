package EjerciciosExamenRecuperacionUD2;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio2 {
    
    public static  double MediaArray (int[] diagonal) {
        double suma = 0;
        for (int i=0;i<diagonal.length;i++) {
                suma+=diagonal[i];
        }
        return suma/diagonal.length;
    }
    public static  int MaximoArray (int[] diagonal) {
        int maximo = diagonal[0];
        for (int i=1;i<diagonal.length;i++) {
                if (diagonal[i]>maximo) {
                    maximo=diagonal[i];
                }
        }
        return maximo;
    }
    public static  int MinimoArray (int[] diagonal) {
        int minimo = diagonal[0];
        for (int i=1;i<diagonal.length;i++) {
                if (diagonal[i]<minimo) {
                    minimo=diagonal[i];
                }
        }
        return minimo;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño:");
        int tamaño = teclado.nextInt();
        int[][] array = new int [tamaño][tamaño];
        Random generador = new Random();
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				array[i][j]=generador.nextInt(18, 66);
			}
		}
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array.length;j++) {
                System.out.print("[" + array[i][j] + "] ");
            }
            System.out.println();
        }
        int [] diagonal = new int [tamaño];
        for (int i=0;i<array.length;i++) {
            diagonal[i]=array[i][i];
        }
        System.out.println("La media es: " + MediaArray(diagonal));
        System.out.println("El máximo es: " + MaximoArray(diagonal));
        System.out.println("El mínimo es: " + MinimoArray(diagonal));
        teclado.close();


    }
}
