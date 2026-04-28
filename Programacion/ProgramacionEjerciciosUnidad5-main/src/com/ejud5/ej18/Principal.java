package com.ejud5.ej18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		  
		File archivoPersonas = new File("personas.dat");
		ArrayList<Persona> personas = new ArrayList<>();

	        personas.add(new Persona("12345678A", "Juan", "Pérez"));
	        personas.add(new Persona("12345678B", "María", "Gómez"));
	        personas.add(new Persona("12345678C", "Luis", "Martínez"));
	        personas.add(new Persona("12345678D", "Ana", "López"));
	        personas.add(new Persona("12345678E", "Carlos", "Sánchez"));
	        personas.add(new Persona("12345678F", "Lucía", "Ramírez"));
	        personas.add(new Persona("12345678G", "Jorge", "Torres"));
	        personas.add(new Persona("12345678H", "Elena", "Flores"));
	        personas.add(new Persona("12345678I", "Pedro", "Vargas"));
	        personas.add(new Persona("12345678J", "Sofía", "Castro"));

	        personas.add(new Persona("12345678K", "Miguel", "Ortega"));
	        personas.add(new Persona("12345678L", "Laura", "Delgado"));
	        personas.add(new Persona("12345678M", "Raúl", "Navarro"));
	        personas.add(new Persona("12345678N", "Carmen", "Romero"));
	        personas.add(new Persona("12345678O", "David", "Moreno"));
	        personas.add(new Persona("12345678P", "Paula", "Suárez"));
	        personas.add(new Persona("12345678Q", "Adrián", "Molina"));
	        personas.add(new Persona("12345678R", "Sara", "Rubio"));
	        personas.add(new Persona("12345678S", "Alberto", "Serrano"));
	        personas.add(new Persona("12345678T", "Marta", "Iglesias"));

	        personas.add(new Persona("12345678U", "Fernando", "Gil"));
	        personas.add(new Persona("12345678V", "Beatriz", "Cruz"));
	        personas.add(new Persona("12345678W", "Iván", "Herrera"));
	        personas.add(new Persona("12345678X", "Patricia", "Medina"));
	        personas.add(new Persona("12345678Y", "Rubén", "Castillo"));
	        personas.add(new Persona("12345678Z", "Nuria", "Cortés"));
	        personas.add(new Persona("87654321A", "Óscar", "León"));
	        personas.add(new Persona("87654321B", "Claudia", "Márquez"));
	        personas.add(new Persona("87654321C", "Hugo", "Peña"));
	        personas.add(new Persona("87654321D", "Andrea", "Reyes"));

	        personas.add(new Persona("87654321E", "Pablo", "Vega"));
	        personas.add(new Persona("87654321F", "Silvia", "Campos"));
	        personas.add(new Persona("87654321G", "Diego", "Fuentes"));
	        personas.add(new Persona("87654321H", "Alicia", "Carrasco"));
	        personas.add(new Persona("87654321I", "Manuel", "Ríos"));
	        personas.add(new Persona("87654321J", "Rosa", "Santos"));
	        personas.add(new Persona("87654321K", "Jesús", "Guerrero"));
	        personas.add(new Persona("87654321L", "Teresa", "Prieto"));
	        personas.add(new Persona("87654321M", "Ángel", "Méndez"));
	        personas.add(new Persona("87654321N", "Lidia", "Calvo"));

	        personas.add(new Persona("87654321O", "Enrique", "Pascual"));
	        personas.add(new Persona("87654321P", "Noelia", "Herrero"));
	        personas.add(new Persona("87654321Q", "Gonzalo", "Sanz"));
	        personas.add(new Persona("87654321R", "Cristina", "Blanco"));
	        personas.add(new Persona("87654321S", "Víctor", "Aguilar"));
	        personas.add(new Persona("87654321T", "Eva", "Bravo"));
	        personas.add(new Persona("87654321U", "Mario", "Nieto"));
	        personas.add(new Persona("87654321V", "Lorena", "Pardo"));
	        personas.add(new Persona("87654321W", "Samuel", "Cano"));
	        personas.add(new Persona("87654321X", "Julia", "Marín"));

	        try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoPersonas));
				oos.writeObject(personas);
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoPersonas))) {
				ArrayList<Persona> personasLeidas = new ArrayList<>();
				personasLeidas = (ArrayList<Persona>) ois.readObject();
	        	for (Persona p: personasLeidas)
	        		System.out.println(p.toString());
				
	        	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
		
	}

}
