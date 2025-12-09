package REPASOANTESEXAMEN.MODULAR.EJERCICIO;
import java.util.Scanner;

import REPASOANTESEXAMEN.MODULAR.METODOS.metodosEj1;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] usuarios = new String[100][3]; // 100 usuarios, 3 datos
        boolean menu = true;

        while (menu) {
            System.out.println("********MENU********");
            System.out.println("1. Crear un nuevo User");
            System.out.println("2. Mostrar Usuarios");
            System.out.println("3. Mostrar usuarios mayores o igual que 18");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int selecciona = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (selecciona) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    if (metodosEj1.existeUsuario(usuarios, nombre)) break;

                    System.out.print("Contraseña: ");
                    String contrasenia = teclado.nextLine();

                    if (!metodosEj1.tieneMayuscula(contrasenia) || !metodosEj1.tieneNumero(contrasenia) ||
                        !metodosEj1.tieneCaracterEspecial(contrasenia) || !metodosEj1.tieneLongitudMinima(contrasenia)) {
                        break;
                    }

                    System.out.print("Edad: ");
                    String edad = teclado.nextLine();
                    if (!metodosEj1.esMayorDeEdad(edad)) break;

                    metodosEj1.insertarUsuario(usuarios, nombre, contrasenia, edad);
                    break;
                case 2:
                    metodosEj1.mostrarUsuarios(usuarios);
                    break;
                case 3:
                    metodosEj1.mostrarMayoresQue(usuarios, 18);
                    break;
                case 4:
                    menu = false;
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        teclado.close();
    }
}
