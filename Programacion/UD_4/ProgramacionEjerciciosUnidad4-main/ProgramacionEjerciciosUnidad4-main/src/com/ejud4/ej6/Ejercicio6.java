package com.ejud4.ej6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio6 {

	public static void main(String[] args) {

		Map<String, Double> inventario = new HashMap<>();
		inventario.put("Teclado", 25.0);
		inventario.put("Monitor", 100.0);
		inventario.put("Ratón", 15.0);
		inventario.put("RAM DDR4 8GB", 60.0);
		inventario.put("SSD 2TB NVMe", 100.0);
		
		System.out.println("INVENTARIO ANTES DE PROCESAR");
		Iterator<Map.Entry<String, Double>> it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Double> entrada = it.next();
			System.out.println("Producto: " + entrada.getKey() + " - Precio: " + entrada.getValue());
		}
				
		/*Recorremos el mapa y subimos el precio a aquellos productos cuyo
		 * precio sea superior a 50.0 */
		it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Double> entrada = it.next();
			if (entrada.getValue()>50.0)
				inventario.put(entrada.getKey(), entrada.getValue()*1.1f);
		}
		
		System.out.println("\nINVENTARIO DESPUÉS DE PROCESAR");
		it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String,Double> entrada = it.next();
			System.out.println("Producto: " + entrada.getKey() + " - Precio: " + entrada.getValue());
		}
		
		
		
		
		
		
	}

}
