import java.util.Random;
import java.util.Scanner;
public class EjercicioRepasoJOSE {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numIntentosTemporal = 2;
        int numIntentosFijos = 3;
        int contIntentosFijos= 0;
        int contIntentosTemporal = 0;
        int codTemporal = 0;
        int codAcceso = 2580;
        int codUsuario;
        boolean salir = true;
    
    

        System.out.println("Introduce el codigo de acceso: ");
        codUsuario = teclado.nextInt();

        while (codUsuario <= 0 && salir == true) {
            if (codUsuario == codAcceso && numIntentosFijos != contIntentosFijos) {
                System.out.println("Codigo coreecto");
                Random generador = new Random();
                int numeroAleatorio = generador.nextInt(10,100);
                System.out.println(+numeroAleatorio);
                System.out.println("Introduce el codigo temporal: ");
                codUsuario = teclado.nextInt();
                if (codUsuario == numeroAleatorio){
                    System.out.println("Codigo Correcto");
                    salir = false;
                }else if(codUsuario != numeroAleatorio){
                    contIntentosTemporal++;
                    System.out.println("Codigo temporal incorrecto, Introduzca codigo");
                    codUsuario = teclado.nextInt();
                }
                
            }else if (codUsuario != codAcceso){
                contIntentosFijos++;
                System.out.println("Codigo Incorrecto. Numero de intentos restantes "+(numIntentosFijos-contIntentosFijos));
                codUsuario = teclado.nextInt();
            }
        }
    }
}
