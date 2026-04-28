package com.ejud5.ej10;

public class Main {
	public static void validarUsuario(String nombre, int edad) throws DatosInvalidosException{
		
		if (nombre==null || nombre.isEmpty()) {
			throw new DatosInvalidosException("ERROR: El nombre no puede estar vacío.");
		}
		if (edad >=120) {
			throw new DatosInvalidosException("ERROR: Edad supera el máximo.");
		}
		if (edad<0) {
			throw new DatosInvalidosException("ERROR: Edad no puede ser negativa.");
		}
		
	}


	public static void main(String[] args) {
/*
		try {
			validarUsuario("Miguel",35);
			
		} catch (DatosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			validarUsuario("",35);
			
		} catch (DatosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			validarUsuario("Manuel",135);
			
		} catch (DatosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			validarUsuario("María", -20);
			
		} catch (DatosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	*/	
		String nombres [] = {null,"Miguel","","Manuel","María"};
		int edades [] = {20,35,35,135,-20};
		
		for (int i=0;i<5;i++) {
			try {
				validarUsuario(nombres[i],edades[i]);
				System.out.println("Usuario " + nombres[i] + " válido.");		

				
			} catch (DatosInvalidosException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
		
		
	}

}
