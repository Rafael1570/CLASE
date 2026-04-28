package com.ejud5.ej8;

public class CuentaBancaria {

	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	public CuentaBancaria(double saldo) {
		this.saldo=saldo;
	}
	
	public void retirar(double cantidad) throws SaldoInsuficienteException {
		if(cantidad>this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente.");
		}
		else {
			this.saldo=this.saldo-cantidad;
		}
	}
}
