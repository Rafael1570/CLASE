package REPASOANTESEXAMEN.STRING;
import java.util.Scanner;
public class Ejercicio7_19 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:  ");
        teclado = new Scanner(System.in);
        String Frase  = teclado.nextLine();
        System.out.println("La longuitud es: "+ Frase.length());
    }   
}
