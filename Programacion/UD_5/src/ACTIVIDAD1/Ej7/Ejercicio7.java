package ACTIVIDAD1.Ej7;

import java.util.Scanner;

class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio7 {

    public static void validarNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Nota fuera de rango (0-10)");
        }
    }

    public static void main(String[] args) {
        double[] notas = {5, 8, 12, -3, 7};

        for (int i = 0; i < notas.length; i++) {
            try {
                validarNota(notas[i]);
                System.out.println("Nota válida: " + notas[i]);
            } catch (NotaInvalidaException e) {
                System.out.println("Error en nota " + notas[i] + ": " + e.getMessage());
            }
        }
    }
}   
