package com.ejemplo.biblioteca;

/**
 * Representa un documento de una biblioteca.
 * Un documento puede mostrar su información básica y comprobar si se considera largo.
 */
public interface Documento {

    /**
     * Devuelve la información básica del documento.
     *
     * @return una cadena con la información del documento
     */
    String mostrarInformacion();

    /**
     * Indica si el documento se considera largo.
     *
     * @return true si el documento es largo, false en caso contrario
     */
    boolean esLargo();
}
