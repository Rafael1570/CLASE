package com.example;

public class Proyecto {

    private String nombre;
    private String líder;
    private int duración;
    private double presupuesto;

    public Proyecto() {
    }

    public Proyecto(String nombre, String líder, int duración, double presupuesto) {
        this.nombre = nombre;
        this.líder = líder;
        this.duración = duración;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLíder() {
        return líder;
    }

    public int getDuración() {
        return duración;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLíder(String líder) {
        this.líder = líder;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", líder='" + líder + '\'' +
                ", duración=" + duración +
                ", presupuesto=" + presupuesto +
                '}';
    }
}