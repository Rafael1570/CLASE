package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        File archivoProyectos = new File("proyectos.json");
        File archivoFiltrados = new File("proyectos_largos_maria.json");

        try {

            List<Proyecto> proyectos = mapper.readValue(
                    archivoProyectos,
                    new TypeReference<List<Proyecto>>() {}
            );

            List<Proyecto> proyectosLargosMaria = new ArrayList<Proyecto>();

            for (Proyecto proyecto : proyectos) {

                if (proyecto.getLíder().equalsIgnoreCase("Juan")) {
                    proyecto.setLíder("Alberto");
                }

                if (proyecto.getLíder().equalsIgnoreCase("Maria")
                        && proyecto.getDuración() > 12) {

                    proyectosLargosMaria.add(proyecto);
                }
            }

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(archivoProyectos, proyectos);

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(archivoFiltrados, proyectosLargosMaria);

            System.out.println("archivo proyectos.json actualizado correctamente.");
            System.out.println("archivo proyectos_largos_maria.json creado correctamente.");

            System.out.println();
            System.out.println("proyectos liderados por Maria con más de 12 meses:");

            for (Proyecto proyecto : proyectosLargosMaria) {
                System.out.println(proyecto);
            }

        } catch (Exception e) {
            System.out.println("se ha producido un error: " + e.getMessage());
        }
    }
}