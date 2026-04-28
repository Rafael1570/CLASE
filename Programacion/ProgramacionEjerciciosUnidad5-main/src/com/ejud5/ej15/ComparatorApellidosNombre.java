package com.ejud5.ej15;

import java.util.Comparator;

public class ComparatorApellidosNombre implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int resultado=0;
		if (o1.getApellidos().compareTo(o2.getApellidos())<0) {
			resultado=-1;
		}else if (o1.getApellidos().compareTo(o2.getApellidos())>0) {
			resultado=1;
		}else {
			if (o1.getNombre().compareTo(o2.getNombre())<0) {
				resultado=-1;
			}else if (o1.getNombre().compareTo(o2.getNombre())>0){
				resultado=1;
			}
		}
		
		return resultado;
	}

}
