import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaIncidencias {

    private Map<String, List<Incidencia>> incidenciasActivas;
    private List<Incidencia> incidenciasResueltas;
    private Scanner teclado;

    public SistemaIncidencias() {
        incidenciasActivas = new HashMap<>();
        incidenciasResueltas = new ArrayList<>();
        teclado = new Scanner(System.in);
    }

    public void registrarIncidencia() {

        System.out.println("introduce la categoría:");
        String categoria = teclado.nextLine();

        System.out.println("introduce la descripción:");
        String descripcion = teclado.nextLine();

        Incidencia nuevaIncidencia = new Incidencia(descripcion);

        if (!incidenciasActivas.containsKey(categoria)) {
            incidenciasActivas.put(categoria, new ArrayList<>());
        }

        incidenciasActivas.get(categoria).add(nuevaIncidencia);

        System.out.println("incidencia registrada correctamente");
    }

    public void mostrarIncidencias() {

        if (incidenciasActivas.isEmpty()) {
            System.out.println("no hay incidencias activas");
        } else {

            for (Map.Entry<String, List<Incidencia>> entrada : incidenciasActivas.entrySet()) {

                System.out.println("categoría: " + entrada.getKey());

                for (Incidencia incidencia : entrada.getValue()) {
                    System.out.println(incidencia);
                }

                System.out.println();
            }
        }
    }

    public void marcarIncidenciaResuelta(Integer id) {

        boolean encontrada = false;

        for (Map.Entry<String, List<Incidencia>> entrada : incidenciasActivas.entrySet()) {

            for (Incidencia incidencia : entrada.getValue()) {

                if (incidencia.getId().equals(id)) {

                    if (!incidenciasResueltas.contains(incidencia)) {
                        incidenciasResueltas.add(incidencia);
                        System.out.println("incidencia marcada como resuelta");
                    } else {
                        System.out.println("la incidencia ya estaba marcada como resuelta");
                    }

                    encontrada = true;
                    break;
                }
            }

            if (encontrada) {
                break;
            }
        }

        if (!encontrada) {
            System.out.println("no se ha encontrado la incidencia");
        }
    }

    public void actualizarIncidencias() {

        int procesadas = 0;

        Iterator<Map.Entry<String, List<Incidencia>>> iteradorMapa =
                incidenciasActivas.entrySet().iterator();

        while (iteradorMapa.hasNext()) {

            Map.Entry<String, List<Incidencia>> entrada = iteradorMapa.next();

            Iterator<Incidencia> iteradorLista =
                    entrada.getValue().iterator();

            while (iteradorLista.hasNext()) {

                Incidencia incidenciaActiva = iteradorLista.next();

                if (incidenciasResueltas.contains(incidenciaActiva)) {
                    iteradorLista.remove();
                    procesadas++;
                }
            }

            if (entrada.getValue().isEmpty()) {
                iteradorMapa.remove();
            }
        }

        incidenciasResueltas.clear();

        System.out.println("incidencias procesadas: " + procesadas);
    }

    public void mostrarIncidenciasResueltas() {

        if (incidenciasResueltas.isEmpty()) {
            System.out.println("no hay incidencias marcadas como resueltas");
        } else {

            System.out.println("incidencias marcadas como resueltas:");

            for (Incidencia incidencia : incidenciasResueltas) {
                System.out.println(incidencia);
            }
        }
    }

    public void ejecutarMenu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("===== sistema de incidencias =====");
            System.out.println("1. registrar incidencia");
            System.out.println("2. mostrar incidencias activas");
            System.out.println("3. marcar incidencia como resuelta");
            System.out.println("4. actualizar incidencias");
            System.out.println("5. mostrar incidencias resueltas");
            System.out.println("0. salir");
            System.out.println("selecciona una opción:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    registrarIncidencia();
                    break;

                case 2:
                    mostrarIncidencias();
                    break;

                case 3:
                    System.out.println("introduce el id de la incidencia:");
                    Integer id = Integer.parseInt(teclado.nextLine());

                    marcarIncidenciaResuelta(id);
                    break;

                case 4:
                    actualizarIncidencias();
                    break;

                case 5:
                    mostrarIncidenciasResueltas();
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

        SistemaIncidencias sistema = new SistemaIncidencias();

        sistema.ejecutarMenu();
    }
}