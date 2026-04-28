package com.ejud5.ej9;

public class Main {

	public static int obtenerNumeroValido(String texto) throws NumberFormatException{
		
		int numero = Integer.parseInt(texto);
		return numero;
		
	}

	public static void main(String[] args) {
		int numero=0;
		try {
			numero = obtenerNumeroValido("hola");
			System.out.println("El numero es el " + numero);

		} catch (NumberFormatException e) {
			System.out.println("Ha introducido un valor que no corresponde a un número");
		}
		
	}

}
