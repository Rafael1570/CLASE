package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorReservas gestor = new GestorReservas();
        gestor.cargarReservas();

        boolean salir = false;

        while(!salir) {
            System.out.println("MENU");
            System.out.println("1. Añadir reserva");
            System.out.println("2. Listar reserva");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Guardar cambios");
        }
    }
}