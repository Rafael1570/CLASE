package com.example;

public class curso {
    private String nombre;
    private String profesor;
    private int horas;
    private double precio;
    private String modalidad;

    public Curso(String  nombre, String profesor, int horas, double precio, String modalidad){
        this.nombre = nombre;
        this.profesor = profesor;
        this.horas = horas;
        this.precio = precio;
        this.modalidad = modalidad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getProfesor(){
        return profesor;
    }
    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getModalidad(){
        return modalidad;
    }
    public void setModalidad(String modalidad){
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +"\n" +
               "Profesor: " + profesor + "\n" +
               "Horas: " + horas + "\n" +
               "Precio: " + precio + "\n" +
               "Modalidad: " + modalidad + "\n";
        
    }


}
