package com.ejud5.ej15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("datosAlumnos.txt"));
			List<Alumno> listaAlumnos = new ArrayList<>();
			String linea=br.readLine();
			while(linea!=null) {
				
				String datos [];
				datos=linea.split(":");
				Alumno a = new Alumno(datos[0],datos[1],datos[2]);
				listaAlumnos.add(a);
				
				linea=br.readLine();
			}
			
			Collections.sort(listaAlumnos,new ComparatorApellidosNombre());
			
			System.out.println("Listado de alumnos:");
			for (Alumno a: listaAlumnos) {
				System.out.println(a);
			}
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("listadoAlumnosOrdenados.txt"));
			for (Alumno a:listaAlumnos) {
				bw.write(a.toString());
				bw.newLine();
			}
		br.close();
		bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
