package ACTIVIDAD1.Ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Introduce una posición: ");
            int pos = sc.nextInt();

            System.out.println("Valor: " + numeros[pos]);

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición fuera de rango.");
        }

        sc.close();
    }
}
