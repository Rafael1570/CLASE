package com.ejud5.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		try {
			String cadenaNumero = teclado.nextLine();
			Integer numero = Integer.parseInt(cadenaNumero);
			System.out.println("El numero es: " + numero);
		}catch(NumberFormatException e) {
			System.out.println("El dato introducido no es un entero.");
		}
		
	}

}
