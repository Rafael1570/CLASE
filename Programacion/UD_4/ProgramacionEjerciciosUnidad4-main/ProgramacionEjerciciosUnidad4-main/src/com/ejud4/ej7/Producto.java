package com.ejud4.ej7;

public class Producto {

	Integer id;
	String nombre;
	Double precio;
	public Producto(Integer id, String nombre, Double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}
