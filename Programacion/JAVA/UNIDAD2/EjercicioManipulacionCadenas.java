import java.util.Scanner;
public class EjercicioManipulacionCadenas {
    static String contarPalabras(String frase) {
        String[] palabras = frase.trim().split("\\s+");
        return "La frase tiene " + palabras.length + " palabras.";
    }
    static String invertirFrase(String frase) {
        StringBuilder fraseInvertida = new StringBuilder(frase);
        return fraseInvertida.reverse().toString();
    }
    static String convertirVocalesAMayusculas(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiouáéíóú".indexOf(Character.toLowerCase(c)) != -1) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = teclado.nextLine();
        boolean salir = true;
        while (salir) {
            System.out.println("Eligue una opción:");
            System.out.println("1. Contar palabras");
            System.out.println("2. Invertir frase" );
            System.out.println("3. Convertir vocales a mayúsculas ");
            System.out.println("4. Introducir nueva frase");
            System.out.println("5. Terminar");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(contarPalabras(frase));
                    break;
                case 2:
                    System.out.println(invertirFrase(frase));
                    break;
                case 3:
                    System.out.println(convertirVocalesAMayusculas(frase));
                    break;
                case 4:
                    System.out.println("Ingrese una nueva frase:");
                    teclado.nextLine(); // limpiar buffer
                    frase = teclado.nextLine();
                    System.out.println(frase);
                    System.out.println("Frase actualizada.");
                    break;
                case 5:
                    System.out.println("Programa terminado.");
                    salir = false;
            }

        }
    }
}
