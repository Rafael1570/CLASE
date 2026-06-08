package examenud4.main;

import examenud4.modelo.Reserva;
import examenud4.util.AnalizadorReservas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Map<String, Reserva> reservas = new HashMap<>();

        reservas.put("R001", new Reserva("R001", "Alberto", 2, false));
        reservas.put("R003", new Reserva("R003", "Mario", 2, true));
        reservas.put("R002", new Reserva("R002", "Fonsi", 1, true));
        reservas.put("R004", new Reserva("R004", "Miguel", 4, false));
        reservas.put("R005", new Reserva("R005", "Rafa", 5, true));

        System.out.println("Asi se al principio");
        mostrarMapa(reservas);

        System.out.println("==========Total Noches=======");
        int totalNoches = AnalizadorReservas.calcularTotalNoches(reservas);
        System.out.println("Total de noches: "+ totalNoches);
        System.out.println();
        System.out.println("===========Reservas No Confirmadas========");
        int noConfirmadas = AnalizadorReservas.contarReservasNoConfirmadas(reservas);
        System.out.println("No confirmadas: "+noConfirmadas);
        System.out.println("==========Mayor Duracion=====");
        Reserva reservaMayor = AnalizadorReservas.obtenerReservaMayorDuracion(reservas);
        if (reservaMayor != null) {
            System.out.println(reservaMayor);
        } else {
            System.out.println("No hay reservas");
        }
        System.out.println();
        System.out.println("==========Lista ordenada por noches========");
        List<Reserva> listaReservas = AnalizadorReservas.obtenerListaReservas(reservas);
        AnalizadorReservas.ordenarPorNochesAscendente(listaReservas);
        mostrarLista(listaReservas);
        System.out.println("==========Lista ordenada por cliente y noche==========");
        AnalizadorReservas.ordenarPorClienteYNoches(listaReservas);
        System.out.println(listaReservas);


        
    }



    private static void mostrarLista(List<Reserva> listaReservas) {
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva );
        }
    }


    private static void mostrarMapa(Map<String, Reserva> reservas) {
        for (Map.Entry<String, Reserva> entry : reservas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
