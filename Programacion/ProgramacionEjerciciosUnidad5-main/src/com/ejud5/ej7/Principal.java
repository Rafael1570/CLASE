package com.ejud5.ej7;

import java.util.Scanner;

public class Principal {

	public static void validarNota(int nota) throws NotaInvalidaException{
		if (nota <0 || nota >10) {
			throw new NotaInvalidaException("La nota debe estar comprendida entre 0 y 10");
		}
		
	}
	public static void main(String[] args) {
	
		int notas [] = {5, 8, 12, -3, 7};
		
		for (int nota: notas) {
			try {
				validarNota(nota);
				System.out.println("La nota es: " + nota);
			}catch (NotaInvalidaException e) {
				System.out.println(nota + " no es válida. " +e.getMessage());
			}
		
	}
}
	
}

