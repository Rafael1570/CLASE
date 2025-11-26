import java.util.Scanner;

public class Ejercicio8314 {

    public static boolean buscarElemento(int[] matriz, int buscando, int cantidadABuscar) {
        for (int i = 0; i < cantidadABuscar; i++) {
            if (matriz[i] == buscando) {
                return true;
            }
        }
        return false;
    }

    public static int calcularNumeroDivisores(int n) {
        int contadorDivisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contadorDivisores++;
            }
        }
        return contadorDivisores;
    }

    public static int[] calcularDivisores(int n) {
        int[] divisores = new int[calcularNumeroDivisores(n)];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores[j] = i;
                j++;
            }
        }
        return divisores;
    }

    public static int[] devolverComunes(int[] a, int[] b) {
        // el array tendrá como máximo el tamaño del más pequeño
        int tam = Math.min(a.length, b.length);
        int[] comunes = new int[tam];
        int contador = 0;

        for (int i = 0; i < a.length; i++) {
            if (buscarElemento(b, a[i], b.length)) {
                comunes[contador] = a[i];
                contador++;
            }
        }

        // devolver solo los válidos (sin ceros)
        int[] resultadoFinal = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultadoFinal[i] = comunes[i];
        }

        return resultadoFinal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = teclado.nextInt();

        System.out.println("Dime otro numero");
        int num2 = teclado.nextInt();

        int[] divisoresNumero1 = calcularDivisores(num1);
        int[] divisoresNumero2 = calcularDivisores(num2);

        int[] arrayComunes = devolverComunes(divisoresNumero1, divisoresNumero2);

        System.out.print("Divisores de " + num1 + ": ");
        for (int d : divisoresNumero1) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.print("Divisores de " + num2 + ": ");
        for (int d : divisoresNumero2) {
            System.out.print(d + " ");
        }
        System.out.println();
        // MCD = el mayor divisor común (último del array)
        int mcd = arrayComunes[arrayComunes.length - 1];
        System.out.println("El MCD es: " + mcd);
    }
}
