/*Ejercicio propuesto 8.3.5: Crea una función "esPrimo", que reciba un número y 
devuelva el valor booleano "true" si es un número primo o "false" en caso contrario.
Hacer un main que pruebe la función con varios números, algunos primos y otros no,
mostrando un mensaje por pantalla indicando si cada número es primo o no lo es. */


import java.util.Scanner;
public class Ejercicio835 {

    public static boolean esPrimo(int num){
        for (int i=2; i<num; i++){
            if (num % i ==0){
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un numero");
        num=teclado.nextInt();
        if (esPrimo(num)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
    
      
