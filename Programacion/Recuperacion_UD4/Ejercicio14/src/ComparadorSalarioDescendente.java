import java.util.Comparator;

public class ComparadorSalarioDescendente implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        return Double.compare(empleado2.getSalario(), empleado1.getSalario());
    }
}