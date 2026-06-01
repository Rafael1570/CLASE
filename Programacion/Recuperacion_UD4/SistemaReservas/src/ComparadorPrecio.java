import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Reserva> {

    @Override
    public int compare(Reserva reserva1, Reserva reserva2) {
        return Double.compare(reserva1.getPrecio(), reserva2.getPrecio());
    }
}