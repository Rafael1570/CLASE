package ACTIVIDAD1.Ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        try {
            System.out.println("Introduce el primer número: ");
            int a = sc.nextInt();

            System.out.println("Introduce el segundo número: ");
            int b = sc.nextInt();

            int resultado= a/b;
            System.out.println("El resultado es " + resultado);
        }catch (InputMismatchException e){
            System.out.println("La entrada no es correcta, debe ser un número entero");
        }catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
    }
}
