package com.ejemplo.biblioteca;

/**
 * Representa un libro dentro de una biblioteca.
 * Permite consultar su información, prestarlo, devolverlo y comprobar si es largo.
 */
public class Libro implements Documento {

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Autor del libro.
     */
    private String autor;

    /**
     * Número de páginas del libro.
     */
    private int numeroPaginas;

    /**
     * Indica si el libro está prestado o no.
     */
    private boolean prestado;

    /**
     * Crea un libro con título, autor y número de páginas.
     * El libro se crea inicialmente como no prestado.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param numeroPaginas número de páginas del libro
     * @throws NumeroPaginasInvalidoException si el número de páginas es menor o igual que cero
     */
    public Libro(String titulo, String autor, int numeroPaginas) throws NumeroPaginasInvalidoException {
        if (numeroPaginas <= 0) {
            throw new NumeroPaginasInvalidoException("El número de páginas debe ser mayor que cero.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = false;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Modifica el título del libro.
     *
     * @param titulo nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Modifica el autor del libro.
     *
     * @param autor nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el número de páginas del libro.
     *
     * @return número de páginas del libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Modifica el número de páginas del libro.
     *
     * @param numeroPaginas nuevo número de páginas
     * @throws NumeroPaginasInvalidoException si el número de páginas es menor o igual que cero
     */
    public void setNumeroPaginas(int numeroPaginas) throws NumeroPaginasInvalidoException {
        if (numeroPaginas <= 0) {
            throw new NumeroPaginasInvalidoException("El número de páginas debe ser mayor que cero.");
        }

        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Indica si el libro está prestado.
     *
     * @return true si el libro está prestado, false en caso contrario
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Marca el libro como prestado.
     */
    public void prestar() {
        this.prestado = true;
    }

    /**
     * Marca el libro como no prestado.
     */
    public void devolver() {
        this.prestado = false;
    }

    /**
     * Comprueba si el libro es largo.
     * Un libro se considera largo si tiene más de 500 páginas.
     *
     * @return true si tiene más de 500 páginas, false en caso contrario
     */
    @Override
    public boolean esLargo() {
        return numeroPaginas > 500;
    }

    /**
     * Devuelve una cadena con la información completa del libro.
     *
     * @return información del libro
     */
    @Override
    public String mostrarInformacion() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nNúmero de páginas: " + numeroPaginas +
                "\nPrestado: " + (prestado ? "Sí" : "No");
    }
}