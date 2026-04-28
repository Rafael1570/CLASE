package com.ejud5.ej12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainEjercicio12 {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("datosejer12.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String linea;

		int contadorLineas=0;
		try {
			while ((linea = br.readLine()) != null) {
			    	contadorLineas++;
		    }
			System.out.println("El fichero tiene " + contadorLineas + " líneas.");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
