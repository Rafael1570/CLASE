package com.ejud4.ej14;

public class Empleado {
//id único autogenerado, nombre, apellidos, salario
	
	
	static private Integer idAuto=1;
	private Integer id;
	private String nombre;
	private String apellidos;
	private Double salario;
	
	public Empleado(String nombre, String apellidos, Double salario) {
		this.id = idAuto;
		idAuto++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	
	
	
}
