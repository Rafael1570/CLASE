package com.ejud4.examen2025.ej2;

public class Tarea {

	
	static private Integer AutoId=1;
	private Integer id;
	private String descripcion;
	private Boolean completada;
	
	public Tarea(String descripcion, Boolean completada) {
		this.id = AutoId;
		AutoId++;
		this.descripcion = descripcion;
		this.completada = completada;
	}

	public Boolean getCompletada() {
		return completada;
	}

	public void setCompletada(Boolean completada) {
		this.completada = completada;
	}

	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", descripcion=" + descripcion + ", completada=" + completada + "]";
	}
	
	
	
	
	
}
