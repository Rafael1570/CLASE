package com.ejud5.ej18;

import java.io.Serializable;

public class Persona implements Serializable{

	private String dni;
	private String nombre;
	private String apellidos;
	public Persona(String dni, String nombre, String apellidos) {
				if (dni.length()==9) {
					this.dni = dni;
					this.nombre = nombre;
					this.apellidos = apellidos;
				}else {
					System.out.println("No se ha podido crear correctamente el objeto. DNI NO VALIDO.");
					
				}
			}
	public String getDni() {
		return dni;
	}
	public void setDni(String d) {
		if (d!=null) {
			if (d.length()==9) {
				this.dni = d;
			}
					
		}
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
			@Override
			public String toString() {
				return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
			}
	
			
	
	
}
