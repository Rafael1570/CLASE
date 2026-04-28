package com.ejud5.ej16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Ejercicio16 {

	public static void main(String[] args) {

		/*Generación de números aleatorios y escritura en el archivo de salida*/
		Random generador = new Random();
		File archivo = new File("archivoEjer16.dat");
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo))){
			int contador=0;
			while(contador<100) {
				dos.writeInt(generador.nextInt(31));
				contador++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Leer los números del archivo creado y mostrarlos por pantalla*/
		try (DataInputStream dis = new DataInputStream(new FileInputStream(archivo))){
			int i=0;
			while (i<100) {
				int numero = dis.readInt();
				if (i==0) {
					System.out.print(numero);
				}else {
					System.out.print(" - " + numero);
				}
				i++;
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
