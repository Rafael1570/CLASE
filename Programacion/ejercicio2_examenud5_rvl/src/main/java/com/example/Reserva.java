package com.example;

public class Reserva {
    private String id;
    private String aula;
    private String profesor;
    private String fecha;
    private String hora;
    private int duracion;

    public Reserva(String id, String aula, String profesor, String fecha, String hora, int duracion){
        this.id = id;
        this.aula = aula;
        this.profesor = profesor;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getAula(){
        return aula;
    }
    public void setAula(String aula){
        this.id = aula;
    }

    public String getProfesor(){
        return profesor;
    }
    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }

    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Aula: " + aula + "\n" +
                "Profesor: "+ profesro +"\n"+
                "Fecha: " + fecha + "\n"+
                "Hora: " + hora + "\n"+
                "Duracion: " + duracon +"minutos\n";
    }
    
}
