package com.ejud4.ej16;

import java.util.Comparator;

public class ComparadorMarcaModelo implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado=0;
		if (o1.getMarca().compareTo(o2.getMarca())>0) {
			resultado=1;
		}else if (o1.getMarca().compareTo(o2.getMarca())<0) {
			resultado=-1;
		}else {
			if (o1.getModelo().compareTo(o2.getModelo())>0) {
				resultado=1;
			}else if(o1.getModelo().compareTo(o2.getModelo())<0) {
				resultado=-1;
			}else {
				if (o1.getMatricula().compareTo(o2.getMatricula())>0) {
					resultado=1;
				}else if(o1.getMatricula().compareTo(o2.getMatricula())<0) {
					resultado=-1;
				}	
			}
		}
				
		return resultado;
	}

	

}
