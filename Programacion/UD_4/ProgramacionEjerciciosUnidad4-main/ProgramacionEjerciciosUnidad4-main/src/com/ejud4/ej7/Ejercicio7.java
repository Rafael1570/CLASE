package com.ejud4.ej7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio7 {

	public static void main(String args []) {
		Producto p1 = new Producto(1, "Portátil", 899.99);
		Producto p2 = new Producto(2, "Ratón", 25.50);
		Producto p3 = new Producto(3, "Teclado", 49.99);
		Producto p4 = new Producto(4, "Monitor", 199.99);
		Producto p5 = new Producto(5, "Auriculares", 79.95);
		Producto p6 = new Producto(6, "Webcam", 59.90);
		Producto p7 = new Producto(7, "Altavoces", 39.99);
		Producto p8 = new Producto(8, "Disco SSD", 129.99);
		Producto p9 = new Producto(9, "Memoria USB", 19.99);
		Producto p10 = new Producto(10, "Impresora", 149.50);
		
		Map<Integer, Producto> inventario = new HashMap<>();
		inventario.put(1,p1);
		inventario.put(2,p2);
		inventario.put(3,p3);
		inventario.put(4,p4);
		inventario.put(5,p5);
		inventario.put(6,p6);
		inventario.put(7,p7);
		inventario.put(8,p8);
		inventario.put(9,p9);
		inventario.put(10,p10);
		
		System.out.println("INVENTARIO ANTES DE PROCESAR");
		Iterator<Map.Entry<Integer, Producto>> it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,Producto> entrada = it.next();
			System.out.println("Identificador: " + entrada.getKey() + " - Producto: " + entrada.getValue());
		}
				
		/*Recorremos el mapa y subimos el precio a aquellos productos cuyo
		 * precio sea superior a 50.0 */
		it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,Producto> entrada = it.next();
			if (entrada.getValue().getPrecio()>50.0) {
				Producto p = entrada.getValue();
				p.setPrecio(p.getPrecio()*1.1);
				inventario.put(entrada.getKey(), p);
			}
			
		}
		
		System.out.println("\nINVENTARIO DESPUÉS DE PROCESAR");
		it = inventario.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,Producto> entrada = it.next();
			System.out.println("Identificador: " + entrada.getKey() + " - Producto: " + entrada.getValue());
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
