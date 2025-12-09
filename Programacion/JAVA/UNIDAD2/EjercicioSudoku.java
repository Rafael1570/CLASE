import java.util.Scanner;
public class EjercicioSudoku {
    static boolean esFilaValida(int[][] sudoku, int fila) {
        boolean[] numerosVistos = new boolean[sudoku.length + 1];
        for (int j = 0; j < sudoku.length; j++) {
            int numero = sudoku[fila][j];
            if (numero < 1 || numero > sudoku.length || numerosVistos[numero]) {
                return false;
            }
            numerosVistos[numero] = true;
        }
        return true;
    }
    static boolean esColumnaValida(int[][] sudoku, int columna) {
        boolean[] numerosVistos = new boolean[sudoku.length + 1];
        for (int i = 0; i < sudoku.length; i++) {
            int numero = sudoku[i][columna];
            if (numero < 1 || numero > sudoku.length || numerosVistos[numero]) {
                return false;
            }
            numerosVistos[numero] = true;
        }
        return true;
    }
    static boolean esSubcuadroValido(int[][] sudoku, int filaInicio, int columnaInicio, int tamanoSubcuadro) {
        boolean[] numerosVistos = new boolean[sudoku.length + 1];
        for (int i = filaInicio; i < filaInicio + tamanoSubcuadro; i++) {
            for (int j = columnaInicio; j < columnaInicio + tamanoSubcuadro; j++) {
                int numero = sudoku[i][j];
                if (numero < 1 || numero > sudoku.length || numerosVistos[numero]) {
                    return false;
                }
                numerosVistos[numero] = true;
            }
        }
        return true;
    }
    static boolean esTableroValido(int[][] sudoku) {
        int tamanoSubcuadro = (int) Math.sqrt(sudoku.length);
        for (int i = 0; i < sudoku.length; i++) {
            if (!esFilaValida(sudoku, i) || !esColumnaValida(sudoku, i)) {
                return false;
            }
        }
        for (int fila = 0; fila < sudoku.length; fila += tamanoSubcuadro) {
            for (int columna = 0; columna < sudoku.length; columna += tamanoSubcuadro) {
                if (!esSubcuadroValido(sudoku, fila, columna, tamanoSubcuadro)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] sudoku = {{1,4,2,3},{3,2,4,1},{2,1,3,4},{4,3,1,2}};
        if (esTableroValido(sudoku)) {
            System.out.println("El tablero de Sudoku es válido.");
        } else {
            System.out.println("El tablero de Sudoku no es válido.");
        }
    }
}
