import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class SistemaReservas {

    private Map<String, List<Reserva>> reservasActivas;
    private List<Reserva> reservasFinalizadas;
    private Scanner teclado;

    public SistemaReservas() {
        reservasActivas = new HashMap<>();
        reservasFinalizadas = new ArrayList<>();
        teclado = new Scanner(System.in);
    }

    public void registrarReserva() {

        System.out.println("introduce el nombre de la instalación:");
        String instalacion = teclado.nextLine();

        System.out.println("introduce el nombre del cliente:");
        String nombreCliente = teclado.nextLine();

        System.out.println("introduce la hora de la reserva:");
        String hora = teclado.nextLine();

        System.out.println("introduce el precio de la reserva:");
        Double precio = Double.parseDouble(teclado.nextLine());

        Reserva nuevaReserva = new Reserva(nombreCliente, hora, precio);

        if (!reservasActivas.containsKey(instalacion)) {
            reservasActivas.put(instalacion, new ArrayList<>());
        }

        reservasActivas.get(instalacion).add(nuevaReserva);

        System.out.println("reserva registrada correctamente");
    }

    public void mostrarReservasActivas() {

        if (reservasActivas.isEmpty()) {
            System.out.println("no hay reservas activas");
        } else {

            for (Map.Entry<String, List<Reserva>> entrada : reservasActivas.entrySet()) {

                System.out.println("instalación: " + entrada.getKey());

                for (Reserva reserva : entrada.getValue()) {
                    System.out.println(reserva);
                }

                System.out.println();
            }
        }

    }

    public void buscarReserva(Integer id) {

        boolean encontrada = false;

        for (Map.Entry<String, List<Reserva>> entrada : reservasActivas.entrySet()) {

            for (Reserva reserva : entrada.getValue()) {

                if (reserva.getId().equals(id)) {
                    System.out.println("reserva encontrada:");
                    System.out.println(reserva);
                    encontrada = true;
                }
            }
        }

        if (!encontrada) {
            System.out.println("no se ha encontrado la reserva");
        }
    }

    public void finalizarReserva(Integer id) {

        boolean encontrada = false;

        for (Map.Entry<String, List<Reserva>> entrada : reservasActivas.entrySet()) {

            List<Reserva> listaReservas = entrada.getValue();

            Iterator<Reserva> iterador = listaReservas.iterator();

            while (iterador.hasNext()) {

                Reserva reserva = iterador.next();

                if (reserva.getId().equals(id)) {

                    reservasFinalizadas.add(reserva);

                    iterador.remove();

                    encontrada = true;

                    System.out.println("reserva finalizada correctamente");

                    break;
                }
            }

            if (encontrada) {
                break;
            }
        }

        if (!encontrada) {
            System.out.println("no se ha encontrado la reserva");
        }
    }

    public void mostrarReservasFinalizadas() {

        if (reservasFinalizadas.isEmpty()) {
            System.out.println("no hay reservas finalizadas");
        } else {

            System.out.println("reservas finalizadas:");

            for (Reserva reserva : reservasFinalizadas) {
                System.out.println(reserva);
            }
        }
    }

    public void mostrarReservasOrdenadasPorPrecio() {

        List<Reserva> reservasOrdenadas = new ArrayList<>();

        for (Map.Entry<String, List<Reserva>> entrada : reservasActivas.entrySet()) {
            reservasOrdenadas.addAll(entrada.getValue());
        }

        if (reservasOrdenadas.isEmpty()) {
            System.out.println("no hay reservas activas");
        } else {

            reservasOrdenadas.sort(new ComparadorPrecio());

            System.out.println("reservas ordenadas por precio:");

            for (Reserva reserva : reservasOrdenadas) {
                System.out.println(reserva);
            }
        }
    }

    public void eliminarInstalacionesVacias() {

        Iterator<Map.Entry<String, List<Reserva>>> iterador = reservasActivas.entrySet().iterator();

        while (iterador.hasNext()) {

            Map.Entry<String, List<Reserva>> entrada = iterador.next();

            if (entrada.getValue().isEmpty()) {
                iterador.remove();
            }
        }

        System.out.println("instalaciones vacías eliminadas correctamente");
    }

    public void ejecutarMenu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("===== sistema de reservas =====");
            System.out.println("1. registrar reserva");
            System.out.println("2. mostrar reservas activas");
            System.out.println("3. buscar reserva por id");
            System.out.println("4. finalizar reserva");
            System.out.println("5. mostrar reservas finalizadas");
            System.out.println("6. mostrar reservas ordenadas por precio");
            System.out.println("7. eliminar instalaciones vacías");
            System.out.println("0. salir");
            System.out.println("selecciona una opción:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    registrarReserva();
                    break;

                case 2:
                    mostrarReservasActivas();
                    break;

                case 3:
                    System.out.println("introduce el id de la reserva:");
                    Integer idBuscar = Integer.parseInt(teclado.nextLine());

                    buscarReserva(idBuscar);
                    break;

                case 4:
                    System.out.println("introduce el id de la reserva:");
                    Integer idFinalizar = Integer.parseInt(teclado.nextLine());

                    finalizarReserva(idFinalizar);
                    break;

                case 5:
                    mostrarReservasFinalizadas();
                    break;

                case 6:
                    mostrarReservasOrdenadasPorPrecio();
                    break;

                case 7:
                    eliminarInstalacionesVacias();
                    break;

                case 0:
                    System.out.println("programa finalizado");
                    break;

                default:
                    System.out.println("opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        sistema.ejecutarMenu();
    }
}
