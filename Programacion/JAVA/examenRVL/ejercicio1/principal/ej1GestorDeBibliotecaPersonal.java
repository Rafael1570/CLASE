import java.util.Scanner;
public class ej1GestorDeBibliotecaPersonal {
    public static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("------MENU DE OPCIONES-----");
        System.out.println("1. Ver listado");
        System.out.println("2. Prestar libro");
        System.out.println("3. Devolver libro");
        System.out.println("4. Contar prestados");
        System.out.println("5. Terminar");
        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();
        while ( opcion <1||opcion>5){
            System.out.println("Error.Elige entre 1 y 5:");
            opcion = teclado.nextInt();
        }
        return opcion;
    }
    public static int pedirIndiceLibro(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el numero del libro: ");
        int indice = teclado.nextInt();
        while (indice<0||indice >4){
            System.out.println("Incorrecto tiene que ser entre (0 o 4): ");
            indice = teclado.nextInt();
        }
        return indice;
    }
    public static void mostrarLibros(String[] titulos, boolean[] prestados){
        System.out.println("----LIBROS-----");
        for (int i = 0; i<titulos.length;i++){
            String estado = "Disponible";
            if (prestados[i]==true){
                estado="Prestado";
            }
            System.out.println(i+"->"+titulos[i]+"("+estado+")");
        }
    }
    public static boolean prestarLibro(boolean[] prestados, int indice){
        return false;
    }
    public static void main(String[] args) {
      String[] titulos = {"El Quijote","Cien años de soledad","La Fundación","El Señor de los Anillos","1984"};
      boolean[] prestados = new boolean[5];
      int opcion = 0;
      while (opcion != 5){
        opcion=mostrarMenu();
        if ( opcion == 1){
            mostrarLibros(titulos, prestados);
        }else if( opcion == 2) {
            
        }else if(opcion == 3){
            pedirIndiceLibro();
        }else if(opcion == 4){

        }
      }
      System.out.println("Fin del programa");
      for (int i=0;i<prestados.length; i++){
        System.out.println(prestados[i]);
      }
      
    }
}

