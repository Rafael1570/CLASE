package com.ejud5.ej14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
			BufferedWriter bw;
			try {
				bw = new BufferedWriter(new FileWriter("informacion.txt",true));
				System.out.println("Introduzca la información a añadir: ");
	        	String linea = teclado.nextLine();
	            bw.write(linea);
	            bw.newLine();
	            	       
	            bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
       
	}

}
