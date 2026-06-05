package com.rafael.ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorVideojuegos {

    private Map<String, List<Videojuego>> videojuegosPorGenero;

    private static final String FILENAME = "videojuegos.dat";

    public GestorVideojuegos() {
        videojuegosPorGenero = new HashMap<String, List<Videojuego>>();
        cargarDatos();
    }

    public void añadirVideojuego(Videojuego videojuego) {

        if (buscarVideojuegoPorId(videojuego.getId()) != null) {
            System.out.println("ya existe un videojuego con el id " + videojuego.getId());
            return;
        }

        String genero = videojuego.getGenero();

        if (!videojuegosPorGenero.containsKey(genero)) {
            videojuegosPorGenero.put(genero, new ArrayList<Videojuego>());
        }

        videojuegosPorGenero.get(genero).add(videojuego);

        System.out.println("videojuego añadido correctamente: " + videojuego.getTitulo());
    }

    public void mostrarVideojuegosPorGenero(String genero) {

        if (!videojuegosPorGenero.containsKey(genero)
                || videojuegosPorGenero.get(genero).isEmpty()) {

            System.out.println("no hay videojuegos registrados del género " + genero);
            return;
        }

        System.out.println("\nvideojuegos del género " + genero + ":");

        for (Videojuego videojuego : videojuegosPorGenero.get(genero)) {
            System.out.println(videojuego);
        }
    }

    public void prestarVideojuego(String id) {

        Videojuego videojuego = buscarVideojuegoPorId(id);

        if (videojuego == null) {
            System.out.println("no existe ningún videojuego con el id " + id);
            return;
        }

        if (!videojuego.isDisponible()) {
            System.out.println("el videojuego ya está prestado");
            return;
        }

        videojuego.setDisponible(false);

        System.out.println("videojuego prestado correctamente: " + videojuego.getTitulo());
    }

    public void devolverVideojuego(String id) {

        Videojuego videojuego = buscarVideojuegoPorId(id);

        if (videojuego == null) {
            System.out.println("no existe ningún videojuego con el id " + id);
            return;
        }

        if (videojuego.isDisponible()) {
            System.out.println("el videojuego ya estaba disponible");
            return;
        }

        videojuego.setDisponible(true);

        System.out.println("videojuego devuelto correctamente: " + videojuego.getTitulo());
    }

    private Videojuego buscarVideojuegoPorId(String id) {

        for (List<Videojuego> listaVideojuegos : videojuegosPorGenero.values()) {

            for (Videojuego videojuego : listaVideojuegos) {

                if (videojuego.getId().equalsIgnoreCase(id)) {
                    return videojuego;
                }
            }
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {

        File archivo = new File(FILENAME);

        if (!archivo.exists()) {
            System.out.println("todavía no existe un archivo binario. se creará al guardar.");
            return;
        }

        try {
            ObjectInputStream entrada =
                    new ObjectInputStream(new FileInputStream(FILENAME));

            videojuegosPorGenero =
                    (Map<String, List<Videojuego>>) entrada.readObject();

            entrada.close();

            System.out.println("datos cargados correctamente desde " + FILENAME);

        } catch (IOException e) {
            System.out.println("error al leer el archivo binario");
        } catch (ClassNotFoundException e) {
            System.out.println("error al cargar los videojuegos");
        }
    }

    public void guardarDatos() {

        try {
            ObjectOutputStream salida =
                    new ObjectOutputStream(new FileOutputStream(FILENAME));

            salida.writeObject(videojuegosPorGenero);

            salida.close();

            System.out.println("\ndatos guardados correctamente en " + FILENAME);

        } catch (IOException e) {
            System.out.println("error al guardar los datos");
        }
    }
}