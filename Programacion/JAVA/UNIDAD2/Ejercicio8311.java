/*Ejercicio propuesto 8.3.11: Factorial de un número. Escribe un programa en Java que calcule 
el factorial de un número entero. Debes crear un método llamado calcularFactorial que tome un 
número entero como argumento y devuelva su factorial. El factorial de un número entero n se 
calcula multiplicando todos los enteros desde 1 hasta n. En el método main, ingresa un número, 
llama al método calcularFactorial y muestra el resultado en la consola.
 */

import java.util.Scanner;
public class Ejercicio8311 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        System.out.println("Dime el numero para factoriarlo");
        n= teclado.nextInt();
    }
    
}
