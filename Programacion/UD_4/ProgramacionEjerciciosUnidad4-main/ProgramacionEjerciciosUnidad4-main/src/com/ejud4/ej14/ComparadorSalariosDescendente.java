package com.ejud4.ej14;

import java.util.Comparator;

public class ComparadorSalariosDescendente implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int resultado=0;
		
		if (o1.getSalario()>o2.getSalario()) {
			resultado=-1;
		}else if (o1.getSalario()<o2.getSalario()) {
			resultado=1;
		}
				
		return resultado;
	}

	

}
