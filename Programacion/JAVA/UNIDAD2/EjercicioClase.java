/*Crea un método que devuelva un array unidimensional del tamaño que 
*indique el usuario y relleno con número aleatorios del rango 
*(entre 0 y el número que se indique) que indique el usuario también.
*/

import java.util.Random;
import java.util.Scanner;
public class EjercicioClase{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanio= 0;
        int num = 0;
        System.out.println("Indica el tamaño del Array");
        tamanio=teclado.nextInt();
        System.out.println("Tu array tiene el tamaño:" +tamanio);
        System.out.println("Indica hasta que numero llega");
        num=teclado.nextInt();

        Random rnd = new Random();
        int[] numero=new int[tamanio];

        for (int i =0; i<tamanio; i++) {
            numero[i] = rnd.nextInt(num);
        }

         for (int i= 0; i<tamanio; i++) {
            System.out.println(numero[i]);
        }
    }
}