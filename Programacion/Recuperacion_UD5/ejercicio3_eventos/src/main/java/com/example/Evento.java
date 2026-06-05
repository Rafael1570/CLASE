package com.example;

public class Evento {

    private String id;
    private String titulo;
    private String fecha;
    private boolean completado;

    public Evento() {
    }

    public Evento(String id, String titulo, String fecha, boolean completado) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.completado = completado;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", completado=" + completado +
                '}';
    }
}