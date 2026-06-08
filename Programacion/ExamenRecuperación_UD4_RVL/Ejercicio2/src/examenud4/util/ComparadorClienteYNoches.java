package examenud4.util;

import java.util.Comparator;
import examenud4.modelo.Reserva;


public class ComparadorClienteYNoches implements Comparator<Reserva> {

    @Override
    public int compare(Reserva reserva1, Reserva reserva2) {
        int comparacionCliente=
                reserva1.getCliente().compareToIgnoreCase(reserva2.getCliente());
        if (comparacionCliente !=  0) {
            return comparacionCliente;
        }

        if (reserva1.getNoches() > reserva2.getNoches()){
            return 1;
        } else if (reserva1.getNoches() < reserva2.getNoches()){
            return -1;
        } else {
            return 0;
        }
    }
}
