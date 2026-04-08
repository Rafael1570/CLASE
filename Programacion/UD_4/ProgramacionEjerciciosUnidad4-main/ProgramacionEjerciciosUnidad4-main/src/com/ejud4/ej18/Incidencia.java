package com.ejud4.ej18;

public class Incidencia {

	private static int IdCompartido=1;
	private int id;
	private String descripcion;
	
	public Incidencia(String descripcion) {
		this.id=IdCompartido;
		IdCompartido++;
		this.descripcion=descripcion;
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
