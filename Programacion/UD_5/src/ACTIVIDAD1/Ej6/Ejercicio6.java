package ACTIVIDAD1.Ej6;

public class Ejercicio6 {

    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero.");
        }
    }
}