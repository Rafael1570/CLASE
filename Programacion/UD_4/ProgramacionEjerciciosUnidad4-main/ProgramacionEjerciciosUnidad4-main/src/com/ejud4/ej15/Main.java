package com.ejud4.ej15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		  	List<Empleado> empleados = new ArrayList<>();

	        empleados.add(new Empleado("12345678A", "Juan", "Pérez López", 1800.0));
	        empleados.add(new Empleado("23456789B", "María", "García Sánchez", 1950.0));
	        empleados.add(new Empleado("34567890C", "Carlos", "Ruiz Martínez", 2100.0));
	        empleados.add(new Empleado("45678901D", "Laura", "Fernández Gómez", 1750.0));
	        empleados.add(new Empleado("56789012E", "Pedro", "Díaz Moreno", 2400.0));
	
	        Map<String,String> asignacionPuestos = new HashMap<>();
	        asignacionPuestos.put("12345678A", "Programador");
	        asignacionPuestos.put("23456789B", "Analista");
	        asignacionPuestos.put("34567890C", "Programador");
	        asignacionPuestos.put("45678901D", "Diseñador");
	        asignacionPuestos.put("56789012E", "Jefe de Proyecto");
	        
	        System.out.println("LISTA DE EMPLEADOS");
	        
	        Iterator<Empleado> it = empleados.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next().toString());
	        }
	
	        /*Recorremos la lista y subimos el salario a los Programadores
	         * según la información que nos indica el mapa*/        
	        it = empleados.iterator();
	        while(it.hasNext()) {
	        	Empleado temp = it.next();
	        	if (asignacionPuestos.get(temp.getDni()).equals("Programador")) {
	        		temp.setSalario(temp.getSalario()*1.1);
	        	}
	        }
	        
	        System.out.println("LISTA DE EMPLEADOS CON SALARIOS ACTUALIZADOS");
	        
	        it = empleados.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next().toString());
	        }
	
	
	}

}
