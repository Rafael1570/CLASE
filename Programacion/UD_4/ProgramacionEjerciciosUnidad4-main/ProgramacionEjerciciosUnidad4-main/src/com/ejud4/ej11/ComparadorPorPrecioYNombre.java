package com.ejud4.ej11;

import java.util.Comparator;

public class ComparadorPorPrecioYNombre implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		
		int resultado=0;
		
		if (o1.getPrecio()>o2.getPrecio()) {
			resultado=1;
		}else if (o1.getPrecio()<o2.getPrecio()) {
			resultado=-1;
		}else { //si los precios son iguales
			
			if (o1.getNombre().compareTo(o2.getNombre())>0) {
				resultado = 1;
			}else if (o1.getNombre().compareTo(o2.getNombre())<0) {
				resultado = -1;
			}
		}
				
		return resultado;
	}
	

}
