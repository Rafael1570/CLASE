package examenud4.ej1.gestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import examenud4.ej1.modelo.*;
public class SistemaBiblioteca {
    private List<Publicacion> publicaciones;
    public  SistemaBiblioteca {
        publicaciones = new ArrayList<>();
    }
    public List<Publicacion> getPublicaciones(){
        return publicaciones;
    }
    public void agregarPublicacion(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("que tipo de publicacion quieres añadir");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("año de publicacion: ");
        int anyo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("genero: ");
        String genero = scanner.nextLine();

        if (tipo == 1){
            System.out.print("autor: ");
            String autor = scanner.nextLine();
            publicaciones.add(new Libro(titulo, anyo, genero, autor));
            System.out.println("Libro añadido correctamente");
        }else if (tipo == 2){
            System.out.print("numero de revista: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            publicaciones.add(new Revista(titulo, anyo, genero, numero));
            System.out.println("Revista añadida correctamente");
        }else {
            System.out.println("Tipo no valido");
        }
    }
    public void eliminarPublicacion(){
        Scanner scanner = new Scanner(system.in);

        System.out.print("Introduce el id de la publicacion a eliminar");
        int id = scanner.nextInt();

        Publicacion encontrada = null;

        for (Publicacion p : publicaciones){
            if (p.getid() == id){
                encontrada = p;
            }
        }
        if (encontrada != null){
            publicaciones.remove(encontrada);
            System.out.println("Publicacion eliminada");
        }else {
            System.out.println("No se ha encontrado");
        }
    }
    public void buscarPublicacionesPorGenero(String genero) {
        boolean encontrada = false;

        for ( Publicacion p : publicaciones){
            if (p.getGenero().equalsIgnoreCase(genero)){
                System.out.println(p);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("no hay publicaciones de ese genero");
        }
    }
    public void listarPublicacionesOrdenadasPorTitulo(){
        List<publicacion> copia = new ArrayList<>(publicaciones);
        Collections.sort(copia, new ordenarportitulo());

        for (Publicacion p : copia) {
            system.out.println(p);
        }
    }
}

