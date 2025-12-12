
import java.util.Scanner;
public class ej2String {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String fraseOriginal=teclado.nextLine();
        if (fraseOriginal == null||fraseOriginal.trim().isEmpty()){
            System.out.println("Nos has introducido nada.");
            return;
        }
        String[] palabras = fraseOriginal.trim().split("\\s+");
        int numeroPalabras = palabras.length;
        StringBuilder nuevaFraseBuilder = new StringBuilder();
        for (String palabra : palabras) {
            String primeraLetra = palabra.substring(0,1).toUpperCase();
            String restoPalabra = palabra.substring(1).toLowerCase();
            nuevaFraseBuilder.append(primeraLetra).append(restoPalabra).append(" ");
        }
        String nuevaFrase = nuevaFraseBuilder.toString().trim();
        System.out.println("Número de palabras reales: "+numeroPalabras);
        System.out.println("Frase Transformada: "+nuevaFrase);
    }   
}
