package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.io.*;
import java.util.List;

public class CursoGestor {
    public static void main(String[] args){
        System.out.println("Esto no ejecuta");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Curso> cursos = objectMapper.readValue(new File("cursos.json"),
                objectMapper.getTypeFactory().contructCollectionType(List.class, Curso.class));
            System.out.println("Lista original de cursos:");
            for (Curso curso : cursos){
                if (curso.getProfesor().equals("Laura")) {
                    curso.setProfesor("Lucia");
                }
            }

            List<Curso cursosFiltrados = cursos.stream()
                    .filter(c -> c.getModalidad().equals("Online") && c.getHoras() > 45 && c.getNombre().contains("Java"))
                    .sorted((c1, c2) -> Integer.compare(c2.getHoras(), c1.getHoras()))
                    .colllect(Collectors.toList());
            
            objectMapper.writeValue(new File(FILENAME), cursos);

            objectMapper.writeValue(new File("cursos_Java_online_largos.json"), cursosFiltrados);

            BufferedWriter wrier = new BufferedWriter(new FileWriter("cursos_Java_online_largos.json"));
            for (Curso curso : cursosFiltrados){
                writer.write(curso.toString());
                writer.newLine();
            }
            writer.close();

            System.out.println("Cursos online de mas de 45 horas con java: ");
            for (Curso curso : cursosFiltrados){
                System.out.println(curso);
            }
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
