/*/*Ejercicio 8.3.16 El Juego del Ahorcado: El juego del ahorcado es un juego 
en el que un jugador debe adivinar una palabra oculta letra por letra. El jugador 
tiene un número limitado de intentos para adivinar la palabra antes de que se complete
un dibujo de un ahorcado. Un ejemplo de cómo se mostraría el dibujo al terminar el juego
sin éxito sería el siguiente: */

import java.util.Scanner;
public class Ejercicio8316 {

    public static String inicializarAdivinada(int longitud) {
        String palabraAdivinada = "";
        for (int i = 0; i < longitud; i++) {
            palabraAdivinada += "_";
        }
        return palabraAdivinada;
    }

    public static String mostrarAdivinada(String palabraAdivinada) {
        for (int i = 0; i < palabraAdivinada.length(); i++) {
            System.out.println(palabraAdivinada.charAt(i) + " ");
        }
        return palabraAdivinada;
    }
    private static String actualizarPalabraAdivinada(String palabraSecreta, String palabraAdivinada, String letraIntento) {       
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.substring(i,i+1).equals(letraIntento)) {
                palabraAdivinada =palabraAdivinada.substring(0,i) + letraIntento + palabraAdivinada.substring(i+1);
            }else {
                palabraAdivinada = palabraAdivinada +"_";
            }
        }   
        return null;
    }

     private static void dibujarMonigote(int intentos) {
        // TODO Auto-generated method stub
        if (intentos == 1) {
            System.out.println("  O  ");
        } else if (intentos == 2) {
            System.out.println("  O  ");
            System.out.println("  |  ");
        } else if (intentos == 3) {
            System.out.println("  O  ");
            System.out.println(" /|  ");
        } else if (intentos == 4) {
            System.out.println("  O  ");
            System.out.println(" /|\\ ");
        } else if (intentos == 5) {
            System.out.println("  O  ");
            System.out.println(" /|\\ ");
            System.out.println(" /   ");
        } else if (intentos == 6) {
            System.out.println("  O  ");
            System.out.println(" /|\\ ");
            System.out.println(" / \\ ");
            System.out.println("Has perdido. El ahorcado está completo.");
        }
    }





    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        String palabraSecreta="JAVA";
        String palabraAdivinada= inicializarAdivinada(palabraSecreta.length());
        final int MAX_INTENTOS = 6;
        int intentos=0;
        boolean palabraAcertada=false;



        while (intentos<MAX_INTENTOS && palabraAcertada==false) {
            System.out.println("Introduce una letra: ");
            String LetraIntento = teclado.nextLine();

            if (palabraSecreta.contains(LetraIntento)) {
                palabraAdivinada=actualizarPalabraAdivinada(palabraSecreta, palabraAdivinada, LetraIntento);
                System.out.println("¡Letra correcta!");
                System.out.println("Palabra actual: " + palabraAdivinada);
            }else {
                intentos++;
                System.out.println("Letra incorrecta. Te quedan " + (MAX_INTENTOS - intentos) + " intentos.");
                dibujarMonigote(intentos);
            }
        }
        if (palabraAcertada==true) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabraSecreta);
        }
    }
}
