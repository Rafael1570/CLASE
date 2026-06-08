package examenud4.util;

import examenud4.modelo.Reserva;
import java.util.Comparator;

public class ComparadorNochesAscendente implements Comparator<Reserva> {
    @Override
    public int compare(Reserva reserva1, Reserva reserva2) {
        if (reserva1.getNoches() > reserva2.getNoches()){
            return 1;
        } else if (reserva1.getNoches() < reserva2.getNoches()){
            return -1;
        } else {
            return 0;
        }
    }
}
