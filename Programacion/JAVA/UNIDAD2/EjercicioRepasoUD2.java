import java.util.Scanner;

public class EjercicioRepasoUD2 {

    static boolean existeUsuario(String[][] usuarios, String nombre) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(nombre)) {
                System.out.println("El usuario ya existe");
                return true;
            }
        }
        return false;
    }

    static boolean tieneMayuscula(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isUpperCase(contrasenia.charAt(i))) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos una letra mayúscula");
        return false;
    }

    static boolean tieneNumero(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isDigit(contrasenia.charAt(i))) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos un número");
        return false;
    }

    static boolean tieneCaracterEspecial(String contrasenia) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        for (int i = 0; i < contrasenia.length(); i++) {
            if (caracteresEspeciales.indexOf(contrasenia.charAt(i)) != -1) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos un carácter especial");
        return false;
    }

    static boolean tieneLongitudMinima(String contrasenia) {
        if (contrasenia.length() >= 8) {
            return true;
        }
        System.out.println("La contraseña debe tener al menos 8 caracteres");
        return false;
    }

    static boolean esMayorDeEdad(String edad) {
        int edadInt = Integer.parseInt(edad);
        if (edadInt >= 18) {
            return true;
        }
        System.out.println("El usuario debe ser mayor de edad");
        return false;
    }

    static void insertarUsuario(String[][] usuarios, String nombre, String contrasenia, String edad) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] == null) {
                usuarios[i][0] = nombre;
                usuarios[i][1] = contrasenia;
                usuarios[i][2] = edad;
                System.out.println("Usuario registrado con éxito.");
                break;
            }
        }
    }

    static void mostrarUsuarios(String[][] usuarios) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                System.out.println("Usuario: " + usuarios[i][0] + 
                                   ", Contraseña: " + usuarios[i][1] + 
                                   ", Edad: " + usuarios[i][2]);
            }
        }
    }

    static void mostrarMayoresQue(String[][] usuarios, int edadMinima) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                int edad = Integer.parseInt(usuarios[i][2]);
                if (edad >= edadMinima) {
                    System.out.println("Usuario mayor o igual que " + edadMinima + ": " + usuarios[i][0]);
                }
            }
        }
    }

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
                    if (existeUsuario(usuarios, nombre)) break;

                    System.out.print("Contraseña: ");
                    String contrasenia = teclado.nextLine();

                    if (!tieneMayuscula(contrasenia) || !tieneNumero(contrasenia) ||
                        !tieneCaracterEspecial(contrasenia) || !tieneLongitudMinima(contrasenia)) {
                        break;
                    }

                    System.out.print("Edad: ");
                    String edad = teclado.nextLine();
                    if (!esMayorDeEdad(edad)) break;

                    insertarUsuario(usuarios, nombre, contrasenia, edad);
                    break;
                case 2:
                    mostrarUsuarios(usuarios);
                    break;
                case 3:
                    mostrarMayoresQue(usuarios, 18);
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
