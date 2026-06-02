import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SistemaEmpleados {

    public static void mostrarEmpleados(List<Empleado> empleados) {

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        System.out.println();
    }

    public static void aumentarSalarios(List<Empleado> empleados) {

        ListIterator<Empleado> iterador = empleados.listIterator();

        while (iterador.hasNext()) {

            Empleado empleado = iterador.next();

            if (empleado.getSalario() < 1500) {

                Double nuevoSalario =
                        empleado.getSalario() * 1.03;

                empleado.setSalario(nuevoSalario);
            }
        }
    }

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("ana", "garcía", 1400.0));
        empleados.add(new Empleado("rafa", "romero", 1800.0));
        empleados.add(new Empleado("lucía", "lópez", 1350.0));
        empleados.add(new Empleado("carlos", "garcía", 1600.0));
        empleados.add(new Empleado("maría", "sánchez", 1450.0));

        System.out.println("empleados antes de modificar los salarios:");
        mostrarEmpleados(empleados);

        aumentarSalarios(empleados);

        System.out.println("empleados después de modificar los salarios:");
        mostrarEmpleados(empleados);

        empleados.sort(new ComparadorSalarioDescendente());

        System.out.println("empleados ordenados por salario descendente:");
        mostrarEmpleados(empleados);

        empleados.sort(new ComparadorApellidosNombre());

        System.out.println("empleados ordenados por apellidos y nombre:");
        mostrarEmpleados(empleados);
    }
}