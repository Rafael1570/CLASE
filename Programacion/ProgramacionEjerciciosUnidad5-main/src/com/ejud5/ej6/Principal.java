package com.ejud5.ej6;

public class Principal {

	public static int dividir(int a, int b){
		
			return a/b; //Java lanzará la excepción ArithmeticException automáticamente cuando b sea 0
		
	}
	public static void main(String[] args) {

		try {
			System.out.println("El resultado de la division es: " + dividir(8,0));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
