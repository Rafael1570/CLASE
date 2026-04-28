package com.ejud5.ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int resultado=0;
		try {
			System.out.print("Introduce el primer número: ");
	        int a = teclado.nextInt();
	
	        System.out.print("Introduce el segundo número: ");
	        int b = teclado.nextInt();
	        
	        resultado = a/b;
			System.out.println("El resultado es: " + resultado);

		}catch (InputMismatchException e) {
			System.out.println("La entrada no es correcta, debe ser un número entero.");
		}catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}finally {
			System.out.println("Programa terminado.");
		}
        teclado.close();
	}

}
