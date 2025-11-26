package EjerciciosRepaso_U1;
import java.util.Scanner;
public class Ejercicio2RafaelVegaLibrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int opcion;
		int importe = 0;
		int numIngreso = 0;
		int retirar = 0;
		int numRetira = 0;
		int saldo = 0;
		boolean salir=true;
		
		System.out.print(" 1) Ingresar");
		System.out.print(" 2) Retirar");
		System.out.print(" 3) Saldo");
		System.out.print(" 4) Salir");
		opcion = teclado.nextInt();
		System.out.println("Opción: "+opcion);
		
		while(salir) {
				if (opcion == 1) {
					System.out.println("Importe a ingresar:");
					importe = teclado.nextInt();
					numIngreso++;
					System.out.print(" 1) Ingresar");
					System.out.print(" 2) Retirar");
					System.out.print(" 3) Saldo");
					System.out.print(" 4) Salir");
					opcion = teclado.nextInt();
					System.out.println("Opción: "+opcion);
				}else if(opcion == 2) {
					System.out.println("Importe a retirar");
					retirar = teclado.nextInt();
					numRetira++;
					System.out.print(" 1) Ingresar");
					System.out.print(" 2) Retirar");
					System.out.print(" 3) Saldo");
					System.out.print(" 4) Salir");
					opcion = teclado.nextInt();
					System.out.println("Opción: "+opcion);
				}else if(opcion == 3) {
					saldo = (importe - retirar);
					System.out.println("Saldo:"+saldo);
					System.out.print(" 1) Ingresar");
					System.out.print(" 2) Retirar");
					System.out.print(" 3) Saldo");
					System.out.print(" 4) Salir");
					opcion = teclado.nextInt();
					System.out.println("Opción: "+opcion);
				}else if(opcion == 4) {
					System.out.println("---Resume---");
					saldo = (importe - retirar);
					System.out.println("Saldo final:"+saldo);
					System.out.println("Ingresos:"+numIngreso+"(total "+importe+")");
					System.out.println("Retiradas:"+numRetira+"(total "+retirar+")");
					salir = false;
				}
		}
	}
}
