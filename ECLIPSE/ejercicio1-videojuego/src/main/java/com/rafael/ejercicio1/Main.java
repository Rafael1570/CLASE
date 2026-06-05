package com.rafael.ejercicio1;

public class Main {

    public static void main(String[] args) {

        GestorVideojuegos gestor = new GestorVideojuegos();

        gestor.añadirVideojuego(
                new Videojuego("V001", "The Witcher 3",
                        "CD Projekt Red", "Acción", "PC", true));

        gestor.añadirVideojuego(
                new Videojuego("V002", "Stardew Valley",
                        "ConcernedApe", "Simulación", "PC", true));

        gestor.añadirVideojuego(
                new Videojuego("V003", "Halo Infinite",
                        "343 Industries", "Acción", "Xbox", true));

        System.out.println("\nlista después de añadir videojuegos:");

        gestor.mostrarVideojuegosPorGenero("Acción");
        gestor.mostrarVideojuegosPorGenero("Simulación");

        System.out.println("\npréstamo del videojuego V001:");

        gestor.prestarVideojuego("V001");

        gestor.mostrarVideojuegosPorGenero("Acción");

        System.out.println("\ndevolución del videojuego V001:");

        gestor.devolverVideojuego("V001");

        System.out.println("\nestado final:");

        gestor.mostrarVideojuegosPorGenero("Acción");
        gestor.mostrarVideojuegosPorGenero("Simulación");

        gestor.guardarDatos();
    }
}