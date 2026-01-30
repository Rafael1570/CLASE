package Ej5GestorEmpleados;

public class GestorEmpleados {
    static Empleado [] plantilla = new Empleado[10];
    static int numeroEmpleados = 0;

    public void agregarEmpleado(Empleado nuevoEmpleado) {
        plantilla[numeroEmpleados]=nuevoEmpleado;
        numeroEmpleados++;
    }
    public void mostrarEmpleados() {
        System.out.println("Empleados en la plantilla:");
        System.out.println("-------------------------");
        for (int i = 0; i < numeroEmpleados; i++) {
            plantilla[i].mostrarInfo();
        }
    }

    public static void calcularTotalSalario(){
        double calcularTotalSalario = 0;
        for (int i = 0; i<plantilla.length;i++){
            if (plantilla[i]!=null){
                calcularTotalSalario += plantilla[i].salario;
            }
        }
        System.out.println("El total de salarios es: "+calcularTotalSalario);
    }

}
