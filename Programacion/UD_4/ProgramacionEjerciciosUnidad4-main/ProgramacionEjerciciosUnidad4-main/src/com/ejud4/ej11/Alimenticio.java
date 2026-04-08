package com.ejud4.ej11;

public class Alimenticio extends Producto{

	private String fechaCaducidad;
	public Alimenticio(Integer id, String nombre, Double precio, String fecha) {
		super(id, nombre, precio);
		this.fechaCaducidad=fecha;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	@Override
	public String toString() {
		return super.toString() + " - fechaCaducidad: " + fechaCaducidad;
	}
	
	

}
