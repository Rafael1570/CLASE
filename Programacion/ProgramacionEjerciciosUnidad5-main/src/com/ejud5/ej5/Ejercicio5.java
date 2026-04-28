package com.ejud5.ej5;

public class Ejercicio5 {

	public void validarEdad (int edad) throws EdadNegativaException{
		if (edad <0) {
			throw new EdadNegativaException("Error: Edad negativa");
		}
	}
}
