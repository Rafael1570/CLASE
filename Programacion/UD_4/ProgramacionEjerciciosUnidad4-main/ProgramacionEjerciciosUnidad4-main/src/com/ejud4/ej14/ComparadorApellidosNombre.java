package com.ejud4.ej14;

import java.util.Comparator;

public class ComparadorApellidosNombre implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		int resultado=0;
		
		if (e1.getApellidos().compareTo(e2.getApellidos())>0) {
			resultado=1;
		}else if (e1.getApellidos().compareTo(e2.getApellidos())<0) {
			resultado=-1;
		}else {
		
			if (e1.getNombre().compareTo(e2.getNombre())>0) {
				resultado=1;
			}else if (e1.getNombre().compareTo(e2.getNombre())<0) {
				resultado=-1;
			}
		}
			
		return resultado;
	}

	

}
