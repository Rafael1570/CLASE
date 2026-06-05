package com.rafael.ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        File archivoOriginal =
                new File("src/main/resources/proyectos.json");

        File archivoFiltrado =
                new File("src/main/resources/proyectos_largos_maria.json");

        try {

            List<Proyecto> proyectos = mapper.readValue(
                    archivoOriginal,
                    new TypeReference<List<Proyecto>>() {
                    });

            System.out.println("proyectos leídos correctamente:");
            mostrarProyectos(proyectos);

            for (Proyecto proyecto : proyectos) {

                if (proyecto.getLíder().equalsIgnoreCase("Juan")) {
                    proyecto.setLíder("Alberto");
                }
            }

            List<Proyecto> proyectosLargosMaria = new ArrayList<Proyecto>();

            for (Proyecto proyecto : proyectos) {

                if (proyecto.getLíder().equalsIgnoreCase("Maria")
                        && proyecto.getDuración() > 12) {

                    proyectosLargosMaria.add(proyecto);
                }
            }

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(archivoOriginal, proyectos);

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(archivoFiltrado, proyectosLargosMaria);

            System.out.println("\narchivo proyectos.json actualizado correctamente");

            System.out.println("\nproyectos de Maria con una duración superior a 12 meses:");
            mostrarProyectos(proyectosLargosMaria);

            System.out.println("\narchivo proyectos_largos_maria.json creado correctamente");

        } catch (IOException e) {

            System.out.println("error al trabajar con los archivos json");
            e.printStackTrace();
        }
    }

    public static void mostrarProyectos(List<Proyecto> proyectos) {

        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
        }
    }
}