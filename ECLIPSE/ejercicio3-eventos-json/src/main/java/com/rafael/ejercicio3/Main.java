package com.rafael.ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        GestorEventos gestor = new GestorEventos();

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n--- MENÚ DE EVENTOS ---");
            System.out.println("1. añadir evento");
            System.out.println("2. listar eventos");
            System.out.println("3. eliminar evento");
            System.out.println("0. salir");
            System.out.print("elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {

                System.out.print("introduce el id: ");
                String id = teclado.nextLine();

                System.out.print("introduce el título: ");
                String titulo = teclado.nextLine();

                System.out.print("introduce la fecha: ");
                String fecha = teclado.nextLine();

                System.out.print("¿está completado? escribe true o false: ");
                boolean completado = teclado.nextBoolean();
                teclado.nextLine();

                Evento evento =
                        new Evento(id, titulo, fecha, completado);

                gestor.añadirEvento(evento);

            } else if (opcion == 2) {

                gestor.listarEventos();

            } else if (opcion == 3) {

                System.out.print("introduce el id del evento que quieres eliminar: ");
                String id = teclado.nextLine();

                gestor.eliminarEvento(id);

            } else if (opcion == 0) {

                System.out.println("programa finalizado");

            } else {

                System.out.println("opción incorrecta");
            }
        }

        teclado.close();
    }
}