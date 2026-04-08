package com.ejud4.ej16;

public class Vehiculo {

	 private String matricula;
	 private String marca;
	 private String modelo;
	 private Integer anio;
	 public Vehiculo(String matricula, String marca, String modelo, Integer anio) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	 }
	 public String getMarca() {
		 return marca;
	 }
	 public void setMarca(String marca) {
		 this.marca = marca;
	 }
	 public String getModelo() {
		 return modelo;
	 }
	 public void setModelo(String modelo) {
		 this.modelo = modelo;
	 }
	 public Integer getAnio() {
		 return anio;
	 }
	 public void setAnio(Integer anio) {
		 this.anio = anio;
	 }
	 public String getMatricula() {
		 return matricula;
	 }
	 @Override
	 public String toString() {
		return "[matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	 }
	 
	 

	 

}
