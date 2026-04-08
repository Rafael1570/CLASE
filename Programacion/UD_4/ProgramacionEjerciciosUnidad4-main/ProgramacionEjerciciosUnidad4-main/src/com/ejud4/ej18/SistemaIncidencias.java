package com.ejud4.ej18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaIncidencias {

	Map<String, List<Incidencia>> incidenciasActivas;
	List<Incidencia> incidenciasResueltas;
	Scanner teclado = new Scanner(System.in);
	
	
	public void insertarDatosPrueba() {
		Incidencia i1 = new Incidencia("Error en el login");
        Incidencia i2 = new Incidencia("Fallo en la base de datos");
        Incidencia i3 = new Incidencia("Problema con el cable de red");
        Incidencia i4 = new Incidencia("Falla tarjeta gráfica");
        this.incidenciasActivas.get("SOFTWARE").add(i1);
        this.incidenciasActivas.get("SOFTWARE").add(i2);
        this.incidenciasActivas.get("HARDWARE").add(i3);
        this.incidenciasActivas.get("HARDWARE").add(i4);
        
	}
	
	
	
	
	public SistemaIncidencias() {
		this.incidenciasResueltas = new ArrayList<Incidencia>();
		this.incidenciasActivas = new HashMap<>();
		this.incidenciasActivas.put("HARDWARE", new ArrayList<Incidencia>());
		this.incidenciasActivas.put("SOFTWARE", new ArrayList<Incidencia>());
		
		
	}
	
	public void registrarIncidencia() {
		System.out.println("Introduzca el tipo de incidencia: (HARDWARE/SOFTWARE)");
		String tipoIncidencia=teclado.nextLine();
		System.out.println("Introduzca la descripción: ");
		String descripcion = teclado.nextLine();
		
		Incidencia nuevaIncidencia = new Incidencia(descripcion);
		
		this.incidenciasActivas.get(tipoIncidencia).add(nuevaIncidencia);

		 
	}
	
	public void mostrarIncidenciasResueltas() {
		System.out.println("Incidencias resueltas");
		for (Incidencia i: this.incidenciasResueltas) {
			System.out.println(i);
		}
	}
	public void mostrarIncidencias() {
		for (String tipo: this.incidenciasActivas.keySet()) {
			System.out.println("Indidencias de " + tipo);
			for (Incidencia i: this.incidenciasActivas.get(tipo)) {
				System.out.println(i);
			}
		}
		/*Versión con iteradores*/
		/*
		Iterator<String> it = this.incidenciasActivas.keySet().iterator();
		while(it.hasNext()) {
			String tipo = it.next();
			System.out.println("Incidencias de tipo " + tipo);
			Iterator<Incidencia> it2 = this.incidenciasActivas.get(tipo).iterator();
			while(it2.hasNext()) {
				System.out.println(it2.next());
			}
		
		}
		*/
		
		
	} 

	public void marcarIncidenciaResuelta(int id) {
		for (String tipo: this.incidenciasActivas.keySet()) {
			for (Incidencia i: this.incidenciasActivas.get(tipo)) {
				if (i.getId()==id) {
					this.incidenciasResueltas.add(i);
				}
			}
		}
		
	}
	
	public void actualizarIncidencias() {
		
		for (Incidencia i: this.incidenciasResueltas) {
			for (String categoria: this.incidenciasActivas.keySet()) {
				List<Incidencia> aux = this.incidenciasActivas.get(categoria);
				Iterator<Incidencia> itInc = aux.iterator();
				while(itInc.hasNext()) {
					if (i.getId()==itInc.next().getId()) {
						itInc.remove();
					}
				}
			}
		}
		
	}
	
	public void mostrarMenu() {
		
		this.insertarDatosPrueba();
		int opcion=0;
		System.out.println("\n===== GESTIÓN DE INCIDENCIAS =====");
		System.out.println("1 -> Registrar nueva incidencia (categoría + descripción)");
		System.out.println("2 -> Mostrar incidencias activas agrupadas por categoría");
		System.out.println("3 -> Marcar incidencia como resuelta (por ID)");
		System.out.println("4 -> Mostrar listado de incidencias resueltas");
		System.out.println("5 -> Procesar incidencias resueltas (eliminar del sistema)");
		System.out.println("0 -> Salir del programa");
		System.out.print("Elige una opción: ");
	
		opcion=teclado.nextInt();
		teclado.nextLine();
		
		
		while (opcion!=0) {
			if (opcion==1) {
				this.registrarIncidencia();
			}else if (opcion==2) {
				this.mostrarIncidencias();
			}else if (opcion==3) {
				
				System.out.println("Introduzca el id de la incidencia a resolver: ");
				int idIncidenciaAResolver = teclado.nextInt();
				this.marcarIncidenciaResuelta(idIncidenciaAResolver);
			
			}else if (opcion==4) {
				this.mostrarIncidenciasResueltas();
			}else if (opcion==5) {
				this.actualizarIncidencias();
				
			}
			
			System.out.println("\n===== GESTIÓN DE INCIDENCIAS =====");
			System.out.println("1 -> Registrar nueva incidencia (categoría + descripción)");
			System.out.println("2 -> Mostrar incidencias activas agrupadas por categoría");
			System.out.println("3 -> Marcar incidencia como resuelta (por ID)");
			System.out.println("4 -> Mostrar listado de incidencias resueltas");
			System.out.println("5 -> Procesar incidencias resueltas (eliminar del sistema)");
			System.out.println("0 -> Salir del programa");
			System.out.print("Elige una opción: ");
		
			opcion=teclado.nextInt();
			teclado.nextLine();
		

		}
		
		System.out.println("PROGRAMA FINALIZADO");
		
		
		
	}
	
	

}
