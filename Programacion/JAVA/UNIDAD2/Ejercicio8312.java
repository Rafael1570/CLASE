/*Ejercicio 8.3.12 - Número de Divisores: Escribe un programa modular en Java que,
dado un número entero positivo, calcule y muestre la cantidad de divisores que tiene.
Define una función llamada calcularNumeroDeDivisores que tome el número como argumento y
devuelva el número de divisores. Luego, en el programa principal, solicita al usuario que
ingrese un número y llama a la función para mostrar la cantidad de divisores. Un numero d es
divisor de otro numero n si n%d es igual a cero.
 */
import java.util.Scanner;
public class Ejercicio8312 {

    public static int calcularNumeroDivisores(int n) {
        int contadorDivisores=0;
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                contadorDivisores++;
            }

        }
        return contadorDivisores;
    }
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un número:");
        int numero = teclado.nextInt();
        int divisores=calcularNumeroDivisores(numero);

        System.out.println("El numero "+numero+" tiene "+divisores+" divisores.");
    }
}
