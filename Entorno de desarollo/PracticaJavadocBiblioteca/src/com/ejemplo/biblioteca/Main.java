package com.ejemplo.biblioteca;

/**
 * Clase principal usada para probar el funcionamiento de la clase Libro.
 */
public class Main {

    /**
     * Método principal del programa.
     * Crea un libro, muestra su información y prueba la excepción personalizada.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        try {
            Libro libro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

            System.out.println("Información inicial del libro:");
            System.out.println(libro.mostrarInformacion());

            libro.prestar();

            System.out.println("\nInformación después de prestar el libro:");
            System.out.println(libro.mostrarInformacion());

            if (libro.esLargo()) {
                System.out.println("\nEl libro se considera largo.");
            } else {
                System.out.println("\nEl libro no se considera largo.");
            }

            System.out.println("\nIntentando cambiar el número de páginas a 0...");
            libro.setNumeroPaginas(0);

        } catch (NumeroPaginasInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}