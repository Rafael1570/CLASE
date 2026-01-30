package Ej5GestorEmpleados;

public class Principal {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("12345678A", "Juan Perez", "Desarrollador", 3000.0);
        Empleado e2 = new Empleado("87654321B", "Ana Gomez", "Diseñadora", 2800.0);
        

        GestorEmpleados gestor = new GestorEmpleados();
        gestor.agregarEmpleado(e1);
        gestor.agregarEmpleado(e2);
        gestor.mostrarEmpleados();

        GestorEmpleados.calcularTotalSalario();
    }
}
