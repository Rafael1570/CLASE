package com.ejud5.ej8;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cuenta1 = new CuentaBancaria(1000.0);
		
		try {
			cuenta1.retirar(1500);
			System.out.println("Saldo actualizado: " + cuenta1.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
