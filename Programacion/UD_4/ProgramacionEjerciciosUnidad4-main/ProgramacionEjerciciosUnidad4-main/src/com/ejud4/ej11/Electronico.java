package com.ejud4.ej11;

public class Electronico extends Producto{

	private String marca;

	public Electronico(Integer id, String nombre, Double precio, String marca) {
		super(id, nombre, precio);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString() + ", marca= " + marca;
	}


	
}
