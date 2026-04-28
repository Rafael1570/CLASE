package com.ejud5.ej13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("datosEjer13.txt"));
        	BufferedWriter bw = new BufferedWriter(new FileWriter("salidaEjer13.txt"));
			String linea = br.readLine();

            while (linea != null) {
                
            	String lineaMayus = linea.toUpperCase();
    				
            	bw.write(lineaMayus);
            	bw.newLine();
            	linea = br.readLine();
            	

            }
            bw.close();
            br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
