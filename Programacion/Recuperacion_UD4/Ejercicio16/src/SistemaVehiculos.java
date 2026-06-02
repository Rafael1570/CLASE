import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaVehiculos {

    private Map<String, Vehiculo> vehiculos;
    private Scanner teclado;

    public SistemaVehiculos() {
        vehiculos = new HashMap<>();
        teclado = new Scanner(System.in);
    }

    public void anadirVehiculo() {

        System.out.println("introduce la matrícula:");
        String matricula = teclado.nextLine();

        if (vehiculos.containsKey(matricula)) {
            System.out.println("ya existe un vehículo con esa matrícula");
        } else {

            System.out.println("introduce la marca:");
            String marca = teclado.nextLine();

            System.out.println("introduce el modelo:");
            String modelo = teclado.nextLine();

            System.out.println("introduce el año:");
            Integer anio = Integer.parseInt(teclado.nextLine());

            Vehiculo nuevoVehiculo =
                    new Vehiculo(matricula, marca, modelo, anio);

            vehiculos.put(matricula, nuevoVehiculo);

            System.out.println("vehículo añadido correctamente");
        }
    }

    public void buscarVehiculo() {

        System.out.println("introduce la matrícula:");
        String matricula = teclado.nextLine();

        if (vehiculos.containsKey(matricula)) {

            Vehiculo vehiculo = vehiculos.get(matricula);

            System.out.println("vehículo encontrado:");
            System.out.println(vehiculo);

        } else {
            System.out.println("no se ha encontrado el vehículo");
        }
    }

    public void modificarVehiculo() {

        System.out.println("introduce la matrícula del vehículo que quieres modificar:");
        String matriculaActual = teclado.nextLine();

        if (vehiculos.containsKey(matriculaActual)) {

            Vehiculo vehiculo = vehiculos.get(matriculaActual);

            System.out.println("introduce la nueva matrícula:");
            String nuevaMatricula = teclado.nextLine();

            if (!matriculaActual.equals(nuevaMatricula)
                    && vehiculos.containsKey(nuevaMatricula)) {

                System.out.println("ya existe otro vehículo con esa matrícula");

            } else {

                System.out.println("introduce la nueva marca:");
                String nuevaMarca = teclado.nextLine();

                System.out.println("introduce el nuevo modelo:");
                String nuevoModelo = teclado.nextLine();

                System.out.println("introduce el nuevo año:");
                Integer nuevoAnio = Integer.parseInt(teclado.nextLine());

                vehiculos.remove(matriculaActual);

                vehiculo.setMatricula(nuevaMatricula);
                vehiculo.setMarca(nuevaMarca);
                vehiculo.setModelo(nuevoModelo);
                vehiculo.setAnio(nuevoAnio);

                vehiculos.put(nuevaMatricula, vehiculo);

                System.out.println("vehículo modificado correctamente");
            }

        } else {
            System.out.println("no se ha encontrado el vehículo");
        }
    }

    public void borrarVehiculo() {

        System.out.println("introduce la matrícula:");
        String matricula = teclado.nextLine();

        if (vehiculos.containsKey(matricula)) {

            vehiculos.remove(matricula);

            System.out.println("vehículo eliminado correctamente");

        } else {
            System.out.println("no se ha encontrado el vehículo");
        }
    }

    public void listarVehiculos() {

        if (vehiculos.isEmpty()) {
            System.out.println("no hay vehículos registrados");
        } else {

            System.out.println("lista de vehículos:");

            for (Map.Entry<String, Vehiculo> entrada : vehiculos.entrySet()) {
                System.out.println(entrada.getValue());
            }
        }
    }

    public void listarVehiculosOrdenados() {

        if (vehiculos.isEmpty()) {
            System.out.println("no hay vehículos registrados");
        } else {

            List<Vehiculo> vehiculosOrdenados =
                    new ArrayList<>(vehiculos.values());

            vehiculosOrdenados.sort(new ComparadorVehiculo());

            System.out.println("vehículos ordenados por marca, modelo y matrícula:");

            for (Vehiculo vehiculo : vehiculosOrdenados) {
                System.out.println(vehiculo);
            }
        }
    }

    public void ejecutarMenu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("===== sistema de vehículos =====");
            System.out.println("1. añadir vehículo");
            System.out.println("2. buscar vehículo por matrícula");
            System.out.println("3. modificar vehículo");
            System.out.println("4. borrar vehículo");
            System.out.println("5. listar vehículos");
            System.out.println("6. listar vehículos ordenados");
            System.out.println("0. salir");
            System.out.println("selecciona una opción:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    anadirVehiculo();
                    break;

                case 2:
                    buscarVehiculo();
                    break;

                case 3:
                    modificarVehiculo();
                    break;

                case 4:
                    borrarVehiculo();
                    break;

                case 5:
                    listarVehiculos();
                    break;

                case 6:
                    listarVehiculosOrdenados();
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

        SistemaVehiculos sistema = new SistemaVehiculos();

        sistema.ejecutarMenu();
    }
}