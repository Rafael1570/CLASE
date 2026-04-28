package com.ejud5.ej15;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellidos;
	
	public Alumno(String dni, String nombre, String apellidos) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return dni+":"+nombre+":"+apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
}
