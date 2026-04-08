package com.ejud4.ej10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Estudiante> estudiantes = new ArrayList<>();
		  
	      estudiantes.add(new Estudiante("Ana", 8.5));
	      estudiantes.add(new Estudiante("Luis", 7.2));
	      estudiantes.add(new Estudiante("Carlos", 6.8));
	      estudiantes.add(new Estudiante("Marta", 9.1));
	      estudiantes.add(new Estudiante("Pedro", 5.9));
	      estudiantes.add(new Estudiante("Lucía", 8.0));
	      estudiantes.add(new Estudiante("Javier", 6.5));
	      estudiantes.add(new Estudiante("Sofía", 9.7));
	      estudiantes.add(new Estudiante("Diego", 7.8));
	      estudiantes.add(new Estudiante("Elena", 8.9));

	      Iterator<Estudiante> it = estudiantes.iterator(); 
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	      
	      Collections.sort(estudiantes, new ComparadorNotaAscendente());
	      
	      System.out.println("Estudiantes ordenador por nota ascendente");
	      it = estudiantes.iterator(); 
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	      
	      Collections.sort(estudiantes, new ComparadorNotaDescendente());
	      
	      System.out.println("Estudiantes ordenador por nota descendente");
	      it = estudiantes.iterator(); 
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	
	
	      Collections.sort(estudiantes, new ComparadorNombre());
	      
	      System.out.println("Estudiantes ordenador por nombre");
	      it = estudiantes.iterator(); 
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	
	
	      Collections.sort(estudiantes, new ComparadorNombreZA());
	      
	      System.out.println("Estudiantes ordenador por nombre de la z a la a");
	      it = estudiantes.iterator(); 
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	
	
	}

}
