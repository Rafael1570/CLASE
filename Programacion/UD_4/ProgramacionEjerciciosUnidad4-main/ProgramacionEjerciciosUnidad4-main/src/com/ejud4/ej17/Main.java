package com.ejud4.ej17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map <String,ArrayList<Estudiante>> matriculas = new HashMap<>();
		
		Estudiante e1 = new Estudiante("Ana", 20);
        Estudiante e2 = new Estudiante("Luis", 22);
        Estudiante e3 = new Estudiante("María", 19);
        Estudiante e4 = new Estudiante("Carlos", 21);
        Estudiante e5 = new Estudiante("Lucía", 23);
        Estudiante e6 = new Estudiante("Pedro", 20);
        Estudiante e7 = new Estudiante("Sofía", 18);
        Estudiante e8 = new Estudiante("Javier", 24);
        Estudiante e9 = new Estudiante("Elena", 22);
        Estudiante e10 = new Estudiante("Miguel", 21);
        
        matriculas.put("Historia", new ArrayList<>());
        matriculas.put("Matemáticas", new ArrayList<>());

        /*Añadimos varios estudiantes a las listas de dos asignaturas*/
        matriculas.get("Historia").add(e1); //matriculamos a Ana en Historia
		matriculas.get("Historia").add(e2); //matriculamos a Luis en Historia
		matriculas.get("Matemáticas").add(e1); //matriculamos a Ana en Matemáticas
		matriculas.get("Matemáticas").add(e3); //matriculamos a María en Matemáticas
        matriculas.get("Historia").add(e4); //matriculamos a Carlos en Historia
		matriculas.get("Matemáticas").add(e4); //matriculamos a Carlos en Matemáticas

		/*Mostrar el contenido completo del mapa*/
		System.out.println("Lista de asignaturas y estudiantes usando for-each");
		for (String asignatura: matriculas.keySet()) {
			System.out.println("\nEstudiantes de " + asignatura);
			System.out.println("-----------------------------------------------");
			for (Estudiante e:matriculas.get(asignatura)) {
				System.out.println(e);
				
			}
		}
		System.out.println("====================================================");
		/*Con iteradores*/
		System.out.println("Lista de asignaturas y estudiantes usando iteradores");
		Iterator<String> itAsig = matriculas.keySet().iterator();
		while(itAsig.hasNext()) {
			String asignatura=itAsig.next();
			System.out.println("\nEstudiantes de " + asignatura);
			System.out.println("-----------------------------------------------");
			ArrayList<Estudiante> lista = matriculas.get(asignatura);
			Iterator<Estudiante> itEstudiante = lista.iterator();
			while(itEstudiante.hasNext()) {
				System.out.println(itEstudiante.next());
			}
		}
		
		/*Mostrar estudiantes de la asignatura introducida por teclado*/
		System.out.println("Introduzca la asignatura: ");
		Scanner teclado = new Scanner(System.in);
		String asignatura = teclado.nextLine();
		for (Estudiante e: matriculas.get(asignatura)) {
			System.out.println(e);
		}
		
		System.out.println("Añadiendo un nuevo alumno...");
		System.out.println("Introduzca el nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca la edad: ");
		Integer edad = teclado.nextInt();
		teclado.nextLine();
		Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
		
		System.out.println("Introduzca la asignatura: ");
		String asig = teclado.nextLine();
		/*Comprobamos que la lista asociada al nombre de la asignatura exista (no sea nula)*/
		
		if (matriculas.get(asig)!=null) {//Si la asignatura ya existe en el mapa
			matriculas.get(asig).add(nuevoEstudiante);
		}else {//si no existe, creamos la entrada en el mapa asociandole una lista vacía
			matriculas.put(asig, new ArrayList());
			matriculas.get(asig).add(nuevoEstudiante); //añadimos el estudiante a la lista recién creada
		}
		/*Mostramos contenido para ver si se ha añadido correctamente*/
		System.out.println("====================================================");
		/*Con iteradores*/
		System.out.println("Lista de asignaturas y estudiantes usando iteradores");
		itAsig = matriculas.keySet().iterator();
		while(itAsig.hasNext()) {
			asignatura=itAsig.next();
			System.out.println("\nEstudiantes de " + asignatura);
			System.out.println("---------------------------------------------");
			ArrayList<Estudiante> lista = matriculas.get(asignatura);
			Iterator<Estudiante> itEstudiante = lista.iterator();
			while(itEstudiante.hasNext()) {
				System.out.println(itEstudiante.next());
			}
		}
	
		
		
}

}
