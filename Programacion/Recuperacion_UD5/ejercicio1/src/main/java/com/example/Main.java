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
            System.out.println("===== gestor de eventos =====");
            System.out.println("1. listar eventos");
            System.out.println("2. añadir evento");
            System.out.println("3. eliminar evento");
            System.out.println("0. salir");
            System.out.print("elige una opción: ");
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
                System.out.println("saliendo del programa...");

            } else {
                System.out.println("opción incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static Map<String, Evento> cargarEventos(ObjectMapper mapper) {
        File archivo = new File(NOMBRE_ARCHIVO);

        if (!archivo.exists()) {
            System.out.println("no existe eventos.json. se crea un mapa vacío.");
            return new HashMap<String, Evento>();
        }

        try {
            Map<String, Evento> eventos = mapper.readValue(
                    archivo,
                    new TypeReference<Map<String, Evento>>() {}
            );

            System.out.println("eventos cargados correctamente.");
            return eventos;

        } catch (Exception e) {
            System.out.println("error al cargar eventos: " + e.getMessage());
            return new HashMap<String, Evento>();
        }
    }

    public static void guardarEventos(ObjectMapper mapper, Map<String, Evento> eventos) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(NOMBRE_ARCHIVO), eventos);
            System.out.println("eventos guardados correctamente.");

        } catch (Exception e) {
            System.out.println("error al guardar eventos: " + e.getMessage());
        }
    }

    public static void listarEventos(Map<String, Evento> eventos) {
        if (eventos.isEmpty()) {
            System.out.println("no hay eventos registrados.");
        } else {
            System.out.println("lista de eventos:");

            for (Evento e : eventos.values()) {
                System.out.println(e);
            }
        }
    }

    public static void añadirEvento(Scanner sc, Map<String, Evento> eventos) {
        System.out.print("introduce el id del evento: ");
        String id = sc.nextLine();

        if (eventos.containsKey(id)) {
            System.out.println("ya existe un evento con ese id.");
            return;
        }

        System.out.print("introduce el título: ");
        String titulo = sc.nextLine();

        System.out.print("introduce la fecha: ");
        String fecha = sc.nextLine();

        System.out.print("¿está completado? true/false: ");
        boolean completado = sc.nextBoolean();
        sc.nextLine();

        Evento nuevo = new Evento(id, titulo, fecha, completado);
        eventos.put(id, nuevo);

        System.out.println("evento añadido correctamente.");
    }

    public static void eliminarEvento(Scanner sc, Map<String, Evento> eventos) {
        System.out.print("introduce el id del evento a eliminar: ");
        String id = sc.nextLine();

        if (eventos.containsKey(id)) {
            eventos.remove(id);
            System.out.println("evento eliminado correctamente.");
        } else {
            System.out.println("no existe ningún evento con ese id.");
        }
    }
}