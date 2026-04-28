package com.ejud5.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int [] numeros = {4,7,9,1,8};
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce posición del array: ");
	    try {
		int posicion = teclado.nextInt();
	    System.out.println(numeros[posicion]);
	    }catch (InputMismatchException e) {
	    	System.out.println("Entrada no válida. Debe ser un número entero.");
	    }catch (IndexOutOfBoundsException e) {
	    	System.out.println("Posición no válida. El array sólo tiene 5 elementos.");
	    }
	 
	    teclado.close();
	}

}
