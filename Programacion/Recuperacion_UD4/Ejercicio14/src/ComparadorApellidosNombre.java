import java.util.Comparator;

public class ComparadorApellidosNombre implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {

        int comparacionApellidos =
                empleado1.getApellidos().compareToIgnoreCase(empleado2.getApellidos());

        if (comparacionApellidos != 0) {
            return comparacionApellidos;
        }

        return empleado1.getNombre()
                .compareToIgnoreCase(empleado2.getNombre());
    }
}