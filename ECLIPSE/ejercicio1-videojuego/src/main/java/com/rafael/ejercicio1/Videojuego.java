package com.rafael.ejercicio1;

import java.io.Serializable;

public class Videojuego implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String titulo;
    private String desarrollador;
    private String genero;
    private String plataforma;
    private boolean disponible;

    public Videojuego() {
    }

    public Videojuego(String id, String titulo, String desarrollador, String genero,
            String plataforma, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.plataforma = plataforma;
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", disponible=" + (disponible ? "sí" : "no") +
                '}';
    }
}