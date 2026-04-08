package com.ejud4.ej11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Producto> productos = new ArrayList<>();

		// 5 productos Electronico
		productos.add(new Electronico(101, "Laptop", 899.99, "Dell"));
		productos.add(new Electronico(103, "Tablet", 899.99, "Apple"));
		productos.add(new Electronico(105, "Auriculares", 199.99, "Sony"));
		productos.add(new Electronico(102, "Smartphone", 699.50, "Samsung"));
		productos.add(new Electronico(104, "Monitor", 199.99, "LG"));

		// 5 productos Alimenticio
		productos.add(new Alimenticio(203, "Queso", 3.75, "2026-04-01"));
		productos.add(new Alimenticio(204, "Yogur", 2.10, "2026-03-25"));
		productos.add(new Alimenticio(205, "Chocolate", 1.80, "2027-01-10"));
		productos.add(new Alimenticio(202, "Pan", 1.20, "2026-03-15"));
		productos.add(new Alimenticio(201, "Leche", 1.20, "2026-03-20"));
	
		
		System.out.println("PRODUCTOS SIN ORDENAR");
		Iterator<Producto> it = productos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("PRODUCTOS ORDENADOS POR ID");
		Collections.sort(productos, new ComparadorPorCodigo());
		it = productos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("PRODUCTOS ORDENADOS POR PRECIO Y NOMBRE");
		Collections.sort(productos, new ComparadorPorPrecioYNombre());
		it = productos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	
	}

}
