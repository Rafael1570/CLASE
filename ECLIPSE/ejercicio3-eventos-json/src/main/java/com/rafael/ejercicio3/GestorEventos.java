package com.rafael.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorEventos {

    private Map<String, Evento> eventos;

    private static final String RUTA_ARCHIVO =
            "src/main/resources/eventos.json";

    private ObjectMapper mapper;

    public GestorEventos() {
        eventos = new HashMap<String, Evento>();
        mapper = new ObjectMapper();

        cargarEventos();
    }

    public void cargarEventos() {

        File archivo = new File(RUTA_ARCHIVO);

        if (!archivo.exists()) {
            System.out.println("el archivo eventos.json no existe todavía");
            return;
        }

        try {

            eventos = mapper.readValue(
                    archivo,
                    new TypeReference<Map<String, Evento>>() {
                    });

            System.out.println("eventos cargados correctamente");

        } catch (IOException e) {

            System.out.println("error al leer el archivo eventos.json");
            e.printStackTrace();
        }
    }

    public void guardarEventos() {

        try {

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(RUTA_ARCHIVO), eventos);

            System.out.println("eventos guardados correctamente");

        } catch (IOException e) {

            System.out.println("error al guardar el archivo eventos.json");
            e.printStackTrace();
        }
    }

    public void añadirEvento(Evento evento) {

        if (eventos.containsKey(evento.getId())) {

            System.out.println("ya existe un evento con ese id");
            return;
        }

        eventos.put(evento.getId(), evento);

        guardarEventos();

        System.out.println("evento añadido correctamente");
    }

    public void listarEventos() {

        if (eventos.isEmpty()) {

            System.out.println("no hay eventos registrados");
            return;
        }

        System.out.println("\nlista de eventos:");

        for (Evento evento : eventos.values()) {

            System.out.println(evento);
        }
    }

    public void eliminarEvento(String id) {

        if (!eventos.containsKey(id)) {

            System.out.println("no existe ningún evento con ese id");
            return;
        }

        eventos.remove(id);

        guardarEventos();

        System.out.println("evento eliminado correctamente");
    }
}