import java.util.Scanner;

public class Ejercicio832 {

    public static int calcularMinimo(int numero1, int numero2) {
        int min;
        if (numero1 < numero2) {
            min = numero1;
        } else if (numero1 > numero2) {
            min = numero2;
        } else {
            min = numero1; // Son iguales
        }
        return min;
    }

    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero 1:");
        numero1 = teclado.nextInt();
        System.out.println("Numero 2:");
        numero2 = teclado.nextInt();

        int menor = calcularMinimo(numero1, numero2);

        if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El menor es: " + menor);
        }
    }
}
