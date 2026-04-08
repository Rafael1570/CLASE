package com.ejud4.ej15;

public class Empleado {

	private String dni;
	private String nombre;
	private String apellidos;
	private Double salario;

	public Empleado(String dni, String nombre, String apellidos, Double salario) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	@Override
	public String toString() {
		return "[dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ "]";
	}
	
	
	
		


}
