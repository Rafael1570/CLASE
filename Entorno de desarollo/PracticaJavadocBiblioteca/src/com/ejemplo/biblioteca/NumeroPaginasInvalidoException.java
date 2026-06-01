package com.ejemplo.biblioteca;

/**
 * Excepción que se lanza cuando se intenta usar un número de páginas no válido.
 * Se considera inválido un número de páginas menor o igual que cero.
 */
public class NumeroPaginasInvalidoException extends Exception {

    /**
     * Crea una excepción con un mensaje explicativo.
     *
     * @param mensaje mensaje que explica el motivo del error
     */
    public NumeroPaginasInvalidoException(String mensaje) {
        super(mensaje);
    }
}