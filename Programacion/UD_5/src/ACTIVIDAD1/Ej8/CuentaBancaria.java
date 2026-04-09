package ACTIVIDAD1.Ej8;
import ACTIVIDAD1.Ej8.SaldoInsuficienteException;
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria( double saldo) {
        this.saldo=saldo;
    }

    public void retirar(double cantidad) {
        if(cantidad>this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
    }
}
