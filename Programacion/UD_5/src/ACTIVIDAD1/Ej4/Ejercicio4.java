package ACTIVIDAD1.Ej4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número: ");
            int a = sc.nextInt();

            System.out.print("Introduce otro número: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Error en la operación.");
        } finally {
            System.out.println("Programa terminado.");
            sc.close();
        }
    }
}
