
package examenud4.gestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import examenud4.modelo.Reserva;

public class SistemaReservas {
    private Map<String, Reserva> reservas;

    public SistemaReservas() {
        reservas = new HashMap<>();
    }
    public void agregarReserva(Reserva r) {
        reservas.put(r.getCodigo(), r);
    }
    public void confirmarReserva(String codigo) {
        if (reservas.containsKey(codigo)) {
            Reserva reserva = reservas.get(codigo);

            reserva.setConfirmada(true);
        }
    }
    public void eliminarReservasConfirmadas(int maxNoches) {
        Iterator<Map.Entry<String, Reserva>> iterador = reservas.entrySet().iterator();

        while (iterador.hasNext()) {
            Map.Entry<String, Reserva> entrada = iterador.next();
            Reserva reserva = entrada.getValue();

            if (reserva.isConfirmada() && reserva.getNoches() < maxNoches) {
                iterador.remove();
            }
        }
    }
    public void mostrarReservas() {
        for (Map.Entry<String, Reserva> entrada : reservas.entrySet()) {
            System.out.println(entrada.getValue());
        }
        System.out.println();
    }
}
