package Ej5GestorEmpleados;
public class Empleado {
    String nombre;
    String puesto;
    double salario;
    String dni;


    // Contructores
    public Empleado(String dni, String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.nombre = dni;
        this.puesto = puesto;
        this.salario = salario;
    }
    // Metodos
    public String toString() {
        return "Empleado [nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + ", dni=" + dni + "]";
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }
}