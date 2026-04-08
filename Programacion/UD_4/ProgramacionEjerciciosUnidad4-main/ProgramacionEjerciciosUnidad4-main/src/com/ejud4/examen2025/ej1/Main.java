package com.ejud4.examen2025.ej1;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
	        Scanner scanner = new Scanner(System.in);
	        int opcion;
	//Creación de algunos libros de ejemplo
	Libro libro1 = new Libro("El código Da Vinci", "Dan Brown", 2003, "MISTERIO");
	        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "REALISMO MAGICO");
	        Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "FANTASIA");
	        Libro libro4 = new Libro("1984", "George Orwell", 1949, "DISTOPIA");
	        Libro libro5 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "INFANTIL");

	biblioteca.getLibros().add(libro1);
	biblioteca.getLibros().add(libro2);
	biblioteca.getLibros().add(libro3);
	biblioteca.getLibros().add(libro4);
	biblioteca.getLibros().add(libro5);


	        do {
	            System.out.println("\n=== Sistema de Gestión de Biblioteca ===");
	            System.out.println("1. Agregar libro");
	            System.out.println("2. Eliminar libro");
	            System.out.println("3. Listar libros ordenados por título");
	            System.out.println("4. Listar libros ordenados por año de publicación");
	            System.out.println("5. Buscar libros por género");
	            System.out.println("6. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar buffer


	            switch (opcion) {
	                case 1:
	                    biblioteca.agregarLibro();
	                    break;
	                case 2:
	                    biblioteca.eliminarLibro();
	                    break;
	                
	                case 3:
	                    biblioteca.listarLibrosOrdenadosPorTitulo();
	                    break;
	                case 4:
	                    biblioteca.listarLibrosOrdenadosPorAnyoPublicacion();
	                    break;
	                case 5:
	                    System.out.print("Ingrese el género a buscar: ");
	                    String genero = scanner.nextLine();
	                    biblioteca.buscarLibrosPorGenero(genero);
	                    break;
	                case 6:
	                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción no válida, por favor intente de nuevo.");
	            }
	        } while (opcion != 6);


	        scanner.close();
	    }
	}

