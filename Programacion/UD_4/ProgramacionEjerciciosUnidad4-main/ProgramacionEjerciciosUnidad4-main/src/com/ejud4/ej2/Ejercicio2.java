package com.ejud4.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<>();
		int i=0;
		Random generador = new Random();
		
		while(i<10) {
			listaNumeros.add(generador.nextInt(101));
			i++;
		}
		for (Integer a: listaNumeros) {
			System.out.print(" " + a);
		}
		System.out.println();
		System.out.println("Tamaño lista: " + listaNumeros.size());
		System.out.println("Contiene el 50?: " + listaNumeros.contains(50));

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca posición: ");
		int posicion = teclado.nextInt();
		listaNumeros.remove(posicion);
		
		for (Integer a: listaNumeros) {
			System.out.print(" " + a);
		}
		
		System.out.println("\nIntroduzca el elemento a borrar: ");
		int elemento = teclado.nextInt();
		Integer elementoABorrar = elemento;
		listaNumeros.remove(elementoABorrar);
		
		System.out.println("Lista después de borrar el elemento: ");
		for (Integer a: listaNumeros) {
			System.out.print(" " + a);
		}
		
		
		
		
		
	}

}
