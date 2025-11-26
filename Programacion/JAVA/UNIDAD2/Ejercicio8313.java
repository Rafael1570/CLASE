/* Ejercicio 8.3.13 - Divisores: Escribe un programa modular en Java que, 
dado un número entero positivo, calcule y muestre la cantidad de divisores que tiene.
Define una función llamada calcularDivisores que tome un número como argumento y devuelva
un array con los divisores del número. Luego, en el programa principal, solicita al usuario
que ingrese un número y llama a la función para mostrar los divisores. Haz uso del método creado
en el ejercicio anterior.
*/

import java.util.Scanner;
public class Ejercicio8313 {

    public static int calcularNumeroDivisores(int n) {
        int contadorDivisores=0;
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                contadorDivisores++;
            }

        }
        return contadorDivisores;
    }

    public static int [] calcularDivisores(int n){
        int [] divisores = new int[calcularNumeroDivisores(n)];
        int j=0;
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                divisores[j]=i;
                j++;
            }

        }

        return divisores;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un número:");
        int numero = teclado.nextInt();

        int [] divisores = calcularDivisores(numero);

        for (int i=0;i<divisores.length;i++){
            System.out.println("["+divisores[i]+"]");
        }
    }
    
}
