package com.ejud4.ej5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio5 {

	public static void main(String[] args) {

		List<String> listaPalabras = new ArrayList<>();
		listaPalabras.add("Asado");
		listaPalabras.add("Perra");
		listaPalabras.add("Monitor");
		listaPalabras.add("Gato");
		listaPalabras.add("Torre");
		listaPalabras.add("Mesa");
		listaPalabras.add("Micro");
		listaPalabras.add("Disco duro");
		
		Iterator<String> it = listaPalabras.iterator();
		//Bucle de procesamiento y borrado
		while(it.hasNext()) {
			String temporal = it.next();
			if (temporal.contains("a") || temporal.contains("A")) {
				it.remove();
			}
		}
		//Bucle de salida por pantalla
		it=listaPalabras.iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		
		
		
	}

}
