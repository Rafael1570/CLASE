package com.ejud5.ej17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio17 {

	public static void main(String[] args) {

		File archivoOriginal = new File ("archivoOriginal.jpg");
		File archivoCopia = new File ("archivoCopia.jpg");
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(archivoOriginal))){
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivoCopia));
			long tamanyoEnBytes=archivoOriginal.length();
			int contador=0;
			while (contador<tamanyoEnBytes) {
				dos.writeByte(dis.readByte());
				contador++;
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}

}
