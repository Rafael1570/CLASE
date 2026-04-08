package com.ejud4.ej11;

import java.util.Comparator;

public class ComparadorPorCodigo implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		int resultado=0;
		
		if (o1.getId()>o2.getId()) {
			resultado=1;
		}
		else if (o1.getId()<o2.getId()) {
			resultado=-1;
		}
		return resultado;
	}
	

}
