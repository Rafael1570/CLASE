package com.example;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    private static final String NOMBRE_ARCHIVO = "eventos.json";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Evento> eventos = cargarEventos(mapper);

        int opcion;

        do {
            System.out.println();
            System.out.println("===== GESTOR DE EVENTOS =====");
            System.out.println("1. Listar eventos");
            System.out.println("2. Añadir evento");
            System.out.println("3. Eliminar evento");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                listarEventos(eventos);

            } else if (opcion == 2) {

                añadirEvento(sc, eventos);
                guardarEventos(mapper, eventos);

            } else if (opcion == 3) {

                eliminarEvento(sc, eventos);
                guardarEventos(mapper, eventos);

            } else if (opcion == 0) {

                System.out.println("Programa finalizado.");

            } else {

                System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static Map<String, Evento> cargarEventos(ObjectMapper mapper) {

        File archivo = new File(NOMBRE_ARCHIVO);

        if (!archivo.exists()) {
            System.out.println("No existe eventos.json. Se crea un mapa vacío.");
            return new HashMap<String, Evento>();
        }

        try {

            Map<String, Evento> eventos = mapper.readValue(
                    archivo,
                    new TypeReference<Map<String, Evento>>() {
                    }
            );

            System.out.println("Eventos cargados correctamente.");

            return eventos;

        } catch (Exception e) {

            System.out.println("Error al cargar los eventos: " + e.getMessage());

            return new HashMap<String, Evento>();
        }
    }

    public static void guardarEventos(ObjectMapper mapper, Map<String, Evento> eventos) {

        try {

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(NOMBRE_ARCHIVO), eventos);

            System.out.println("Eventos guardados correctamente.");

        } catch (Exception e) {

            System.out.println("Error al guardar los eventos: " + e.getMessage());
        }
    }

    public static void listarEventos(Map<String, Evento> eventos) {

        if (eventos.isEmpty()) {

            System.out.println("No hay eventos registrados.");

        } else {

            System.out.println();
            System.out.println("===== LISTA DE EVENTOS =====");

            for (Evento evento : eventos.values()) {
                System.out.println(evento);
            }
        }
    }

    public static void añadirEvento(Scanner sc, Map<String, Evento> eventos) {

        System.out.print("Introduce el ID del evento: ");
        String id = sc.nextLine();

        if (eventos.containsKey(id)) {

            System.out.println("Ya existe un evento con ese ID.");

        } else {

            System.out.print("Introduce el título: ");
            String titulo = sc.nextLine();

            System.out.print("Introduce la fecha: ");
            String fecha = sc.nextLine();

            System.out.print("¿Está completado? true o false: ");
            boolean completado = sc.nextBoolean();
            sc.nextLine();

            Evento nuevoEvento = new Evento(id, titulo, fecha, completado);

            eventos.put(id, nuevoEvento);

            System.out.println("Evento añadido correctamente.");
        }
    }

    public static void eliminarEvento(Scanner sc, Map<String, Evento> eventos) {

        System.out.print("Introduce el ID del evento que quieres eliminar: ");
        String id = sc.nextLine();

        if (eventos.containsKey(id)) {

            eventos.remove(id);

            System.out.println("Evento eliminado correctamente.");

        } else {

            System.out.println("No existe ningún evento con ese ID.");
        }
    }
}