package com.ejud4.examen2025.ej1;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		int resultado=0;
		if (o1.getTitulo().compareTo(o2.getTitulo())>0) {
			resultado=1;
		}else if (o1.getTitulo().compareTo(o2.getTitulo())<0) {
			resultado=-1;
		}
		return resultado;
	}

	

}
