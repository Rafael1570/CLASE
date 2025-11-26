/*Ejercicio propuesto 8.3.7: Buscar un elemento en un array. Crea un programa que busque un 
elemento específico en un array. Debes crear un método llamado buscarElemento que tome un array 
de números y un valor a buscar, y devuelva true si el valor está en el array o false si no lo está.
En el método main, crea un array de números y solicita por teclado un valor para buscar, llama al método
buscarElemento y muestra un mensaje en la consola indicando si el valor se encuentra en el array o no.
 */

import java.util.Scanner;
public class Ejercicio837 {

    public static boolean buscarElemento(int array1){
        int[] array = {3,5,7,9,11,13,15};
        for (int i=0; i<array.length; i++){
            if (array[i] != array1){
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int busca = 0;
        System.out.println("Dime el numero para buscar");
        busca=teclado.nextInt();
        if (buscarElemento(busca)){
            System.out.println("El numero se encuentra en el array");
        } else {
            System.out.println("El numero no se encuentra en el array");
        }
    }
}
