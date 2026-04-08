package com.ejud4.examen2025.ej1;

import java.util.Comparator;

public class ComparadorAnyo implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		int resultado=0;
		if (o1.getAnyoPublicacion()>o2.getAnyoPublicacion()) {
			resultado=1;
		}else if (o1.getAnyoPublicacion()<o2.getAnyoPublicacion()) {
			resultado=-1;
		}
		return resultado;
	}



}
