package com.ejud4.ej14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Manuel","Gonzalez",1800.0);
		Empleado e2 = new Empleado("Ana","Lopez",1850.0);
		Empleado e3 = new Empleado("Maria","Perez",1200.0);
		Empleado e4 = new Empleado("Antonio","Gonzalez",1450.0);

		List<Empleado> plantilla = new ArrayList<>();
		plantilla.add(e1);
		plantilla.add(e2);
		plantilla.add(e3);
		plantilla.add(e4);
			
		
		Iterator<Empleado> it = plantilla.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}		
		System.out.println("Antes de la subida salarial"); 
		it = plantilla.iterator();
		while (it.hasNext()) {
			Empleado temp = it.next();
			if (temp.getSalario()<1500.0) {
				Double nuevoSalario=temp.getSalario()*1.03;
				temp.setSalario(nuevoSalario);
			}
		}
		System.out.println("Después de la subida salarial");
		it = plantilla.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Ordenar por Salario de forma descendente
		Collections.sort(plantilla, new ComparadorSalariosDescendente());
	
		System.out.println("Ordenado por Salario Descendente");
		it = plantilla.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Ordenar por Apellidos y después por nombre
		Collections.sort(plantilla, new ComparadorApellidosNombre());

		System.out.println("Ordenado por Apellidos y Nombre");
		it = plantilla.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		
		
		
		
		
		
		
		

	}

}
