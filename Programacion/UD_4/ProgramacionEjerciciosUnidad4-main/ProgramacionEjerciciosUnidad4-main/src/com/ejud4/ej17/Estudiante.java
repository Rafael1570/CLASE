package com.ejud4.ej17;

public class Estudiante{

	private String nombre;
	private Integer edad;
	
	public Estudiante(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
