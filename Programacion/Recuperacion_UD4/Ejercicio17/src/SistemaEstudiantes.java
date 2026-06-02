import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaEstudiantes {

    private Map<String, List<Estudiante>> estudiantesPorAsignatura;
    private Scanner teclado;

    public SistemaEstudiantes() {
        estudiantesPorAsignatura = new HashMap<>();
        teclado = new Scanner(System.in);
    }

    public void anadirEstudiante(String asignatura, Estudiante estudiante) {

        if (!estudiantesPorAsignatura.containsKey(asignatura)) {
            estudiantesPorAsignatura.put(asignatura, new ArrayList<>());
        }

        estudiantesPorAsignatura.get(asignatura).add(estudiante);
    }

    public void cargarDatosIniciales() {

        anadirEstudiante("matemáticas", new Estudiante("ana", 19));
        anadirEstudiante("matemáticas", new Estudiante("carlos", 21));

        anadirEstudiante("historia", new Estudiante("lucía", 20));
        anadirEstudiante("historia", new Estudiante("rafa", 19));
    }

    public void mostrarAsignaturasYEstudiantes() {

        if (estudiantesPorAsignatura.isEmpty()) {
            System.out.println("no hay asignaturas registradas");
        } else {

            for (Map.Entry<String, List<Estudiante>> entrada :
                    estudiantesPorAsignatura.entrySet()) {

                System.out.println("asignatura: " + entrada.getKey());

                for (Estudiante estudiante : entrada.getValue()) {
                    System.out.println(estudiante);
                }

                System.out.println();
            }
        }
    }

    public void mostrarEstudiantesDeUnaAsignatura(String asignatura) {

        if (estudiantesPorAsignatura.containsKey(asignatura)) {

            System.out.println("estudiantes de " + asignatura + ":");

            for (Estudiante estudiante : estudiantesPorAsignatura.get(asignatura)) {
                System.out.println(estudiante);
            }

        } else {
            System.out.println("la asignatura no existe");
        }
    }

    public void registrarEstudiante() {

        System.out.println("introduce la asignatura:");
        String asignatura = teclado.nextLine();

        System.out.println("introduce el nombre del estudiante:");
        String nombre = teclado.nextLine();

        System.out.println("introduce la edad:");
        int edad = Integer.parseInt(teclado.nextLine());

        Estudiante nuevoEstudiante = new Estudiante(nombre, edad);

        anadirEstudiante(asignatura, nuevoEstudiante);

        System.out.println("estudiante añadido correctamente");
    }

    public void ejecutarMenu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("===== sistema de estudiantes =====");
            System.out.println("1. mostrar todas las asignaturas y estudiantes");
            System.out.println("2. mostrar estudiantes de una asignatura");
            System.out.println("3. añadir un estudiante");
            System.out.println("0. salir");
            System.out.println("selecciona una opción:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    mostrarAsignaturasYEstudiantes();
                    break;

                case 2:
                    System.out.println("introduce la asignatura:");
                    String asignatura = teclado.nextLine();

                    mostrarEstudiantesDeUnaAsignatura(asignatura);
                    break;

                case 3:
                    registrarEstudiante();
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

        SistemaEstudiantes sistema = new SistemaEstudiantes();

        sistema.cargarDatosIniciales();

        sistema.ejecutarMenu();
    }
}