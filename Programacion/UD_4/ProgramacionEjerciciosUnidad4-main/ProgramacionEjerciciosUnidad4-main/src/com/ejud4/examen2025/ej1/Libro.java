package com.ejud4.examen2025.ej1;

public class Libro {

	 static Integer autoId=1;
	 Integer id;
	 String titulo;
	 String autor;
     int anyoPublicacion;
     String genero;
       
     
     
	 public Libro(String titulo, String autor, int anyoPublicacion, String genero) {
		this.id = autoId;
		autoId++;
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		this.genero = genero;
	}
	 
	 public int getId() {
		 return this.id;
	 }
	 
	 
	 public String getTitulo() {
		 return titulo;
	 }
	 public void setTitulo(String titulo) {
		 this.titulo = titulo;
	 }
	 public String getAutor() {
		 return autor;
	 }
	 public void setAutor(String autor) {
		 this.autor = autor;
	 }
	 public int getAnyoPublicacion() {
		 return anyoPublicacion;
	 }
	 public void setAnyoPublicacion(int anyoPublicacion) {
		 this.anyoPublicacion = anyoPublicacion;
	 }
	 public String getGenero() {
		 return genero;
	 }
	 public void setGenero(String genero) {
		 this.genero = genero;
	 }

	 @Override
	 public String toString() {
		return "[id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", anyoPublicacion=" + anyoPublicacion
				+ ", genero=" + genero + "]";
	 }
 
     
	
	


}
