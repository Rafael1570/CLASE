package REPASOANTESEXAMEN.MODULAR.METODOS;

public class metodosEj1 {
    public static boolean existeUsuario(String[][] usuarios, String nombre) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null && usuarios[i][0].equals(nombre)) {
                System.out.println("El usuario ya existe");
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMayuscula(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isUpperCase(contrasenia.charAt(i))) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos una letra mayúscula");
        return false;
    }

    public static boolean tieneNumero(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isDigit(contrasenia.charAt(i))) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos un número");
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasenia) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        for (int i = 0; i < contrasenia.length(); i++) {
            if (caracteresEspeciales.indexOf(contrasenia.charAt(i)) != -1) {
                return true;
            }
        }
        System.out.println("La contraseña debe tener al menos un carácter especial");
        return false;
    }

    public static boolean tieneLongitudMinima(String contrasenia) {
        if (contrasenia.length() >= 8) {
            return true;
        }
        System.out.println("La contraseña debe tener al menos 8 caracteres");
        return false;
    }

    public static boolean esMayorDeEdad(String edad) {
        int edadInt = Integer.parseInt(edad);
        if (edadInt >= 18) {
            return true;
        }
        System.out.println("El usuario debe ser mayor de edad");
        return false;
    }

    public static void insertarUsuario(String[][] usuarios, String nombre, String contrasenia, String edad) {
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

    public static void mostrarUsuarios(String[][] usuarios) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                System.out.println("Usuario: " + usuarios[i][0] + 
                                   ", Contraseña: " + usuarios[i][1] + 
                                   ", Edad: " + usuarios[i][2]);
            }
        }
    }

    public static void mostrarMayoresQue(String[][] usuarios, int edadMinima) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) {
                int edad = Integer.parseInt(usuarios[i][2]);
                if (edad >= edadMinima) {
                    System.out.println("Usuario mayor o igual que " + edadMinima + ": " + usuarios[i][0]);
                }
            }
        }
    }
}
