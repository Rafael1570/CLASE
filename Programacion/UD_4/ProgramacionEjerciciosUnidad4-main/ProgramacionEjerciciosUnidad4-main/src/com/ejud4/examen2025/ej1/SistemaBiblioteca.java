package com.ejud4.examen2025.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SistemaBiblioteca {

	private Scanner teclado = new Scanner (System.in);
	private List<Libro> listaLibros;
	
	
	public List<Libro> getLibros() {
		return listaLibros;
	}

	public SistemaBiblioteca() {
		this.listaLibros = new ArrayList<>();
	}

	public void agregarLibro() {
		
		System.out.println("Agregando Libro...");
		System.out.println("Introduzca título: ");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca autor: ");
		String autor = teclado.nextLine();
		System.out.println("Introduzca año: ");
		int anyo = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca género: ");
		String genero = teclado.nextLine();
		genero = genero.toUpperCase();
		
		this.listaLibros.add(new Libro(titulo, autor, anyo, genero));
	
	}

	public void eliminarLibro() {
		System.out.println("Eliminando libro...");
		System.out.println("Introduzca ID: ");
		int id = teclado.nextInt();
		teclado.nextLine();
		
		Iterator<Libro> it = this.listaLibros.iterator();
		while(it.hasNext()) {
			Libro l = it.next();
			if(l.getId()==id) {
				it.remove();
			}
		}
		
	}

	public void listarLibrosOrdenadosPorTitulo() {
		System.out.println("Listado de libros ordenados por título");
		Collections.sort(this.listaLibros,new ComparadorTitulo());
		for (Libro l: this.listaLibros) {
			System.out.println(l);
		}
	
	}
	
	public void listarLibrosOrdenadosPorAnyoPublicacion() {
		System.out.println("Listado de libros ordenados por año:");
		Collections.sort(this.listaLibros,new ComparadorAnyo());
		for (Libro l: this.listaLibros) {
			System.out.println(l);
		}
	
	}
	
	public void buscarLibrosPorGenero(String genero) {
		System.out.println("Libros del género " + genero);
		for (Libro l: this.listaLibros) {
			if (l.getGenero().equals(genero)) {
				System.out.println(l);
			}
		}
	}

}
