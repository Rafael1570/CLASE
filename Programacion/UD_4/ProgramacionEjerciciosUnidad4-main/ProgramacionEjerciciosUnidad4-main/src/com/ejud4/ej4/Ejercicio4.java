package com.ejud4.ej4;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {

	public static void main(String[] args) {

		String cadena = "Esto es una cadena de ejemplo";
		Map <Character,Integer> frecuencias = new HashMap<>();
		cadena = cadena.toLowerCase();
		
		for (int i=0;i<cadena.length();i++) { //recorremos la cadena
			Character c=cadena.charAt(i);//Nos quedamos con cada caracter en cada iteración
			if (frecuencias.containsKey(c)) {//si el mapa contiene el caracter 
				frecuencias.put(c,frecuencias.get(c)+1); // lo colocamos en el mapa con la frecuencia actual más uno
			}else {//Si el mapa no contiene el caracter lo colocamos con frecuencia 1
				frecuencias.put(c, 1);
			}
		}
		//Recorremos el mapa para visualizar su contenido
		for (Map.Entry<Character, Integer> entrada : frecuencias.entrySet()) {
			System.out.println("Caracter: " + entrada.getKey() + " - " + entrada.getValue());
		}
		
		
	}

}
