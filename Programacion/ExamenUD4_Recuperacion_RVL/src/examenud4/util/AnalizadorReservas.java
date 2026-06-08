package examenud4.util;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import examenud4.modelo.Reserva;

public class AnalizadorReservas {
    public static int calcularTotalNoches(Map<String, Reserva> resevas) {
        int totalNoches = 0;
        for (Map.Entry<String, Reserva> entrada : resevas.entrySet()){
            Reserva reserva = entrada.getValue();

            totalNoches += reserva.getNoches();
        }
        return totalNoches;
    }
    public static int contarReservasNoConfirmadas(Map<String, Reserva> reservas) {
        int contador = 0;

        for (Map.Entry<String, Reserva> entrada : reservas.entrySet()){
            Reserva reserva = entrada.getValue();

            if (!reserva.isConfirmada()) {
                contador++;
            }
        }
        return contador;
    }
    public static Reserva obtenerReservaMayorDuracion(Map<String, Reserva> reserva) {
        Reserva reservaMayor = null;

        for (Map.Entry<String, Reserva> entrada : reserva.entrySet()){
           Reserva reservaActual = entrada.getValue();
           if (reservaMayor == null || reservaActual.getNoches() > reservaMayor.getNoches()) {
                reservaMayor = reservaActual;
           }
        }
        return reservaMayor;
    }
    public static boolean existeReservaDeCliente(Map<String, Reserva> reservas, String cliente) {
        for (Map.Entry<String, Reserva> entrada : reservas.entrySet()){
          Reserva reserva = entrada.getValue();
          if (reserva.getCliente().equalsIgnoreCase(cliente)) {
            return true;
          }
        }
        return false;
    }
    public static void eliminarReservasDeCliente(Map<String, Reserva> reservas, String cliente) {
        Iterator<Map.Entry<String, Reserva>> iterador = reservas.entrySet().iterator();

        while (iterador.hasNext()) {
            Map.Entry<String, Reserva> entrada = iterador.next();
            Reserva reserva = entrada.getValue();

            if (reserva.getCliente().equalsIgnoreCase(cliente)) {
                iterador.remove();
            }
        }
    }
    public static List<Reserva> obtenerListaReservas(Map<String, Reserva> reservas) {
        List<Reserva> listaReservas = new ArrayList<>();
        for (Map.Entry<String, Reserva> entrada : reservas.entrySet()){
          Reserva reserva = entrada.getValue();
          listaReservas.add(reserva);
        }
        return listaReservas;
    }
    public static void ordenarPorNochesAscendente(List<Reserva> lista) {
        lista.sort(new ComparadorNochesAscendente());
    }
    public static void ordenarPorClienteYNoches(List<Reserva> lista){
        lista.sort(new ComparadorClienteYNoches());
    }
}
