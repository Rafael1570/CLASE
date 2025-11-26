import java.util.Scanner;
import java.util.Arrays; // Importante para redimensionar el array final

public class Ejercicio838 {

    // CORRECCIÓN 1: El método buscar ahora recorre TODO lo que le digamos
    // He añadido 'cantidadABuscar' para que solo busque en la parte rellena del array
    public static boolean buscarElemento(int[] matriz, int buscando, int cantidadABuscar) {
        for (int i = 0; i < cantidadABuscar; i++) {
            if (matriz[i] == buscando) {
                return true; // Si lo encuentra, devuelve true y sale
            }
        }
        return false; // Si termina el bucle y no lo encontró, devuelve false
    }

    public static void main(String[] args) {
        // No necesitas Scanner para este ejercicio específico, pero lo dejo si lo usas después
        Scanner teclado = new Scanner(System.in);
        
        int[] arrayConDuplicados = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        
        System.out.print("Array original: ");
        for (int i = 0; i < arrayConDuplicados.length; i++) {
            System.out.print(arrayConDuplicados[i] + " ");
        }
        System.out.println(); // Salto de línea

        int[] arraySinDuplicados = eliminarDuplicados(arrayConDuplicados);
        
        // CORRECCIÓN 3: Quitamos la impresión de la dirección de memoria extraña
        System.out.print("Array corregido: ");
        for (int i = 0; i < arraySinDuplicados.length; i++) {
            System.out.print(arraySinDuplicados[i] + " ");
        }
    }

    public static int[] eliminarDuplicados(int[] duplicados) {
        // Creamos un array temporal del mismo tamaño (por si no hubiera duplicados)
        int[] temporal = new int[duplicados.length];
        
        // CORRECCIÓN 2: Usamos un contador propio para el nuevo array
        int contadorUnicos = 0; 

        for (int i = 0; i < duplicados.length; i++) {
            // Buscamos si el número ya existe en el array 'temporal'
            // Solo buscamos hasta 'contadorUnicos' (la parte que ya hemos llenado)
            if (!buscarElemento(temporal, duplicados[i], contadorUnicos)) {
                temporal[contadorUnicos] = duplicados[i];
                contadorUnicos++; // Solo avanzamos en el nuevo array si agregamos un número
            }
        }

        // Paso final: Crear el array exacto con el tamaño correcto
        // Si no hacemos esto, el array tendría ceros al final
        int[] resultadoFinal = new int[contadorUnicos];
        for (int i = 0; i < contadorUnicos; i++) {
            resultadoFinal[i] = temporal[i];
        }
        
        return resultadoFinal;  
    }
}