package com.ejud4.ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) {

		List<String> listaPalabras =  new ArrayList<>();
		listaPalabras.add("queso");
		listaPalabras.add("coche");
		listaPalabras.add("perro");
		listaPalabras.add("gato");
		listaPalabras.add("pan");
		listaPalabras.add("telefono");
		listaPalabras.add("casa");
		listaPalabras.add("monitor");
		listaPalabras.add("perro");
		listaPalabras.add("gato");
		
		for (String palabra:listaPalabras) {
			System.out.print("  " + palabra);
		}
		
		System.out.println();
		
		Set<String> listaPalabrasSinDuplicados = new HashSet<>();
		
		for (String palabra:listaPalabras) {
			listaPalabrasSinDuplicados.add(palabra);
		}
		
		for (String palabra:listaPalabrasSinDuplicados) {
			System.out.print(" " + palabra);
		}
		
		
		
		
		
	}

}
