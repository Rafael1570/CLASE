package com.ejud4.ej8;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private Double nota;
	
	public Estudiante(String nombre, Double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", nota=" + nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	@Override
	public int compareTo(Estudiante o) {
		int resultado=0;
		if (this.nota>o.nota) {
			resultado=1;
		}else if (o.nota>this.nota){
			resultado=-1;
		}
		//Si la comparación se hubiese requerido por nombre haríamos lo siguiente
		/*if (this.nombre.compareTo(o.nombre)>0) {
			resultado=1;
		}else if (this.nombre.compareTo(o.nombre)<0) {
			resultado=-1;
		}*/
		return resultado;
	}
	
	
}
