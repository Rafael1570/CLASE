package EjerciciosExamenRecuperacionUD2;

import java.util.Scanner;
public class Ejercicio4 {
    public static boolean confirmar() {
        boolean acepta = false;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Desea confirmar?");
        respuesta = teclado.nextLine();
        while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
            System.out.println("Respuesta no válida. Por favor, responda 'si' o 'no'.");
            System.out.println("¿Desea confirmar?");
            respuesta = teclado.nextLine();
        }if (respuesta.equalsIgnoreCase("si")) {
            acepta = true;
        }
        return acepta;
    }
    public static void main(String[] args) {
        boolean acepta;
        acepta = confirmar();
        if (acepta) {
            System.out.println("El usuario ha confirmado");
        }else {
            System.out.println("El usuario no ha confirmado");
        }
    }
}
