package examenud4.ej1.principal;

import java.util.Scanner;

import examenud4.ej1.gestor.*;
import examenud4.ej1.modelo.*;

public class Main {
public static void main(String[] args) {
SistemaBiblioteca biblioteca = new SistemaBiblioteca();
Scanner scanner = new Scanner(System.in);
int opcion;
// Creación de algunas publicaciones de ejemplo
Publicacion p1 = new Libro("El código Da Vinci", 2003, "Misterio", "Dan Brown");
Publicacion p2 = new Libro("Cien años de soledad", 1967, "Realismo mágico", "Gabriel García Márquez");
Publicacion p3 = new Revista("National Geographic", 2024, "Divulgación", 315);
Publicacion p4 = new Libro("1984", 1949, "Distopía", "George Orwell");
Publicacion p5 = new Revista("Muy Interesante", 2023, "Ciencia", 452);
Publicacion p6 = new Revista("Science", 2024, "Ciencia", 452);
/*FALTA EL CÓDIGO PARA AÑADIR LAS PUBLICACIONES A LA COLECCIÓN
        */
biblioteca.getPublicaciones().add(p1);
biblioteca.getPublicaciones().add(p2);
biblioteca.getPublicaciones().add(p3);
biblioteca.getPublicaciones().add(p4);
biblioteca.getPublicaciones().add(p5);
biblioteca.getPublicaciones().add(p6);
do {
System.out.println("\n=== Sistema de Gestión de Biblioteca ===");
System.out.println("1. Agregar publicación");
System.out.println("2. Eliminar publicación");
System.out.println("3. Listar publicaciones ordenadas por título");
System.out.println("4. Listar publicaciones ordenadas por año de publicación");
System.out.println("5. Buscar publicaciones por género");
System.out.println("6. Salir");
System.out.print("Seleccione una opción: ");
opcion = scanner.nextInt();
scanner.nextLine(); // Limpiar buffer
switch (opcion) {
case 1:
biblioteca.agregarPublicacion();
break;
case 2:
biblioteca.eliminarPublicacion();
break;
case 3:
biblioteca.listarPublicacionesOrdenadasPorTitulo();
break;
case 4:
biblioteca.listarPublicacionesOrdenadasPorAnyoPublicacion();
break;
case 5:
System.out.print("Ingrese el género a buscar: ");
String genero = scanner.nextLine();
biblioteca.buscarPublicacionesPorGenero(genero);
break;
case 6:
System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
break;
default:
System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } 
while (opcion != 6);
scanner.close();
    }
}
