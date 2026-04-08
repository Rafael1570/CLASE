package com.ejud4.ej10;

import java.util.Comparator;

public class ComparadorNombreZA implements Comparator<Estudiante> {

	
	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		int resultado=0;
		
		if (o1.getNombre().compareTo(o2.getNombre())>0)
			resultado=-1;
		else if(o1.getNombre().compareTo(o2.getNombre())<0)
			resultado=1;
		
		return resultado;
	}

}
