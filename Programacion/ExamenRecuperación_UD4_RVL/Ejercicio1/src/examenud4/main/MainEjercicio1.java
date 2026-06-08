package examenud4.main;

import examenud4.gestion.SistemaReservas;
import examenud4.modelo.Reserva;

public class MainEjercicio1 {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        sistema.agregarReserva(new Reserva("R001", "Ana", 3, false));
        sistema.agregarReserva(new Reserva("R002", "Luis", 1, true));
        sistema.agregarReserva(new Reserva("R003", "Marta", 5, false));
        sistema.agregarReserva(new Reserva("R004", "Luis", 2, true));
        sistema.agregarReserva(new Reserva("R005", "Carlos", 4, false));
        sistema.mostrarReservas();
        sistema.confirmarReserva("R003");
        sistema.eliminarReservasConfirmadas(3);
        sistema.mostrarReservas();
    }
}
