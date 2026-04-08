package com.ejud4.ej16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String args []) {
	
		Map<String, Vehiculo> vehiculos= new HashMap<>();
		
		/*Cargamos datos con algunos vehículos*/
		vehiculos.put("7766NRC", new Vehiculo("7766NRC", "Toyota", "Corolla", 2019));
		vehiculos.put("1234ABC", new Vehiculo("1234ABC", "Toyota", "Corolla", 2018));
		vehiculos.put("1235ABM", new Vehiculo("1235ABM", "Toyota", "Corolla", 2021));
		vehiculos.put("5678DEF", new Vehiculo("5678DEF", "Ford", "Focus", 2016));
        vehiculos.put("9012GHI", new Vehiculo("9012GHI", "Seat", "Ibiza", 2020));
        vehiculos.put("3269LMP", new Vehiculo("3269LMP", "BMW", "Serie 5", 2021));
        vehiculos.put("3456JKL", new Vehiculo("3456JKL", "BMW", "Serie 3", 2019));
        vehiculos.put("7890MNO", new Vehiculo("7890MNO", "Audi", "A4", 2021));
        vehiculos.put("6548MNP", new Vehiculo("6548MNP", "Seat", "León", 2022));
		
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		
		System.out.println("----- MENÚ DE VEHÍCULOS -----");
		System.out.println("1. Añadir un nuevo vehículo");
		System.out.println("2. Buscar uno por su clave y mostrar sus datos");
		System.out.println("3. Modificar todos los datos de un vehículo dada su matrícula");
		System.out.println("4. Borrar un vehículo existente indicando matrícula");
		System.out.println("5. Listar los vehículos");
		System.out.println("6. Listar los vehículos ordenados por marca, modelo y matricula");
		System.out.println("0. Salir");
		System.out.println("-----------------------------");
		System.out.print("Seleccione una opción: ");
				
		opcion=teclado.nextInt();
		teclado.nextLine();
		
		
		while(opcion!=0) {
			
			if (opcion==1) {
				System.out.println("Añadiendo nuevo vehículo...");
				String matricula;
				System.out.println("Introduzca matrícula: ");
				matricula=teclado.nextLine();
				String marca;
				System.out.println("Introduzca marca: ");
				marca=teclado.nextLine();
				String modelo;
				System.out.println("Introduzca modelo: ");
				modelo=teclado.nextLine();
				int anio;
				System.out.println("Introduzca año: ");
				anio=teclado.nextInt();
				teclado.nextLine();
				Vehiculo nuevoVehiculo = new Vehiculo(matricula,marca,modelo,anio);
				vehiculos.put(matricula, nuevoVehiculo);
				
			}else if (opcion==2) {
				String matricula;
				System.out.println("Introduzca matrícula: ");
				matricula=teclado.nextLine();
				System.out.println(vehiculos.get(matricula));
				
			}else if (opcion==3) {
				String matricula;
				System.out.println("Introduzca matrícula: ");
				matricula=teclado.nextLine();
				Vehiculo v = vehiculos.get(matricula);
				String marca;
				System.out.println("Introduzca nueva marca: ");
				marca=teclado.nextLine();
				String modelo;
				System.out.println("Introduzca nuevo modelo: ");
				modelo=teclado.nextLine();
				int anio;
				System.out.println("Introduzca nuevo año: ");
				anio=teclado.nextInt();
				teclado.nextLine();

				v.setMarca(marca);
				v.setModelo(modelo);
				v.setAnio(anio);

				
			}else if (opcion==4) {
				String matricula;
				System.out.println("Introduzca matrícula: ");
				matricula=teclado.nextLine();
				vehiculos.remove(matricula);
				
			}else if (opcion==5) {
				Iterator<String> it = vehiculos.keySet().iterator();
				while(it.hasNext()) {
					
					System.out.println(vehiculos.get(it.next()));
				}
				
	
			}else if (opcion==6) {
				
				List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>(); 
				/*Recorriendo el mapa por valores*/
				/*for (Vehiculo v: vehiculos.values()) {
					listaVehiculos.add(v);
				}*/
				/*Recorriendo el mapa por entradas*/
				/*
				for (Map.Entry<String,Vehiculo> entrada : vehiculos.entrySet()) {
					listaVehiculos.add(entrada.getValue());
					
				}
				*/
				/*Recorriendo por claves*/
				/*Recorriendo por claves con for*/
				for (String matricula: vehiculos.keySet()) {
					listaVehiculos.add(vehiculos.get(matricula));
				}
				/*Recorriendo por claves con un iterador*/
				/*Iterator<String> itMatriculas = vehiculos.keySet().iterator(); 
				while(itMatriculas.hasNext()) {
					listaVehiculos.add(vehiculos.get(itMatriculas.next()));
				}*/
				
				Collections.sort(listaVehiculos,new ComparadorMarcaModelo());
				Iterator<Vehiculo> it = listaVehiculos.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
	
			}

			System.out.println("----- MENÚ DE VEHÍCULOS -----");
			System.out.println("1. Añadir un nuevo vehículo");
			System.out.println("2. Buscar uno por su clave y mostrar sus datos");
			System.out.println("3. Modificar todos los datos de un vehículo dada su matrícula");
			System.out.println("4. Borrar un vehículo existente indicando matrícula");
			System.out.println("5. Listar los vehículos");
			System.out.println("6. Listar los vehículos ordenados por marca, modelo y matrícula");
			System.out.println("0. Salir");
			System.out.println("-----------------------------");
			System.out.print("Seleccione una opción: ");
					
			opcion=teclado.nextInt();
			teclado.nextLine();

				
		}

	}
}
