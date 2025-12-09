/*Ejercicio propuesto 7.10: Crea un programa que cree un array de 5x5 caracteres,
lo rellene con puntos en todas las posiciones excepto aquellas en las que el número
de fila es igual al número de columna, en las que pondrá un X. Luego muestra su contenido
en pantalla, que deberá ser algo como: */

package REPASOANTESEXAMEN.ARRAYS;

public class Ejericio7_10 {
    public static void main(String[] args) {
        char[][] array = new char[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 'X';
                } else {
                    array[i][j] = '.';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
