package com.ejud4.examen2025.ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaDeGestionDeTareas {

	private Map <String,List<Tarea>> agenda;
	private Set <Tarea> historico;
	private Scanner teclado = new Scanner(System.in);
	
	public SistemaDeGestionDeTareas() {
		this.agenda=new HashMap<>();
		this.agenda.put("PERSONAL", new ArrayList<>());
		this.agenda.put("LABORAL", new ArrayList<>());
		this.historico=new HashSet<>();
		
	}

	public void agregarTarea(String categoria, String descripcion) {
		
		System.out.println("Estado de la tarea (completada/no completada): ");
		String estado=teclado.nextLine().toUpperCase();
		Boolean completada=false;
		if (estado.equals("COMPLETADA"))
			completada=true;
			
		Tarea nuevaTarea = new Tarea(descripcion,completada);
		this.agenda.get(categoria).add(nuevaTarea);
		
		
	}

	public void mostrarTareas() {

		Iterator<String> itMapa = this.agenda.keySet().iterator();
		while(itMapa.hasNext()) {
			String categoria = itMapa.next();
			Iterator<Tarea> itLista = this.agenda.get(categoria).iterator();
			System.out.println("Mostrando tareas de " + categoria);
			
			System.out.println("Tareas completadas");
			while(itLista.hasNext()) {
				Tarea temp = itLista.next();
				if(temp.getCompletada())
					System.out.println(temp);
			}
			
			System.out.println("Tareas no completadas");
			itLista=this.agenda.get(categoria).iterator();
			while(itLista.hasNext()) {
				Tarea temp = itLista.next();
				if(!temp.getCompletada())
					System.out.println(temp);
			}
			
			
			
			
		}
		
	}

	public void eliminarTarea(int idEliminar) {
		Iterator<String> itMapa = this.agenda.keySet().iterator();
		while(itMapa.hasNext()) {
			String categoria = itMapa.next();
			Iterator<Tarea> itLista = this.agenda.get(categoria).iterator();
			while(itLista.hasNext()) {
				Tarea temp = itLista.next();
				if(temp.getId()==idEliminar)
					itLista.remove();
			}
			
		}
		
	}

	public void marcarTareaComoCompletada(int idCompletar) {
		Iterator<String> itMapa = this.agenda.keySet().iterator();
		while(itMapa.hasNext()) {
			String categoria = itMapa.next();
			Iterator<Tarea> itLista = this.agenda.get(categoria).iterator();
			while(itLista.hasNext()) {
				Tarea temp = itLista.next();
				if(temp.getId()==idCompletar) {
					temp.setCompletada(true);
					this.historico.add(temp);				}
			}
			
		}
		
		
	}

	public void mostrarHistorico() {
		System.out.println("Histórico de tareas");
		for (Tarea t: this.historico) {
			System.out.println(t);
		}
			
	}
	
}
