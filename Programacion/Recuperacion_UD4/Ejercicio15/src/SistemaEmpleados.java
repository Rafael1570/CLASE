import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SistemaEmpleados {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("11111111A", "ana", "garcía", 1500));
        empleados.add(new Empleado("22222222B", "carlos", "lópez", 1700));
        empleados.add(new Empleado("33333333C", "lucía", "pérez", 1600));
        empleados.add(new Empleado("44444444D", "rafa", "romero", 1800));
        empleados.add(new Empleado("55555555E", "maría", "sánchez", 1550));

        Map<String, String> puestosTrabajo = new HashMap<>();

        puestosTrabajo.put("11111111A", "Programador");
        puestosTrabajo.put("22222222B", "Analista");
        puestosTrabajo.put("33333333C", "Diseñador");
        puestosTrabajo.put("44444444D", "Programador");
        puestosTrabajo.put("55555555E", "Analista");

        Iterator<Empleado> iterador = empleados.iterator();

        while (iterador.hasNext()) {

            Empleado empleado = iterador.next();

            String puesto = puestosTrabajo.get(empleado.getDni());

            if (puesto.equals("Programador")) {

                double nuevoSalario =
                        empleado.getSalario() * 1.10;

                empleado.setSalario(nuevoSalario);
            }
        }

        System.out.println("empleados actualizados:");

        for (Empleado empleado : empleados) {

            String puesto = puestosTrabajo.get(empleado.getDni());

            System.out.println(empleado);
            System.out.println("puesto: " + puesto);
            System.out.println();
        }
    }
}