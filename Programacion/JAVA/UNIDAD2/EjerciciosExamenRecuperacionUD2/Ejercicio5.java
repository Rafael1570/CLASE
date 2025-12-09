package EjerciciosExamenRecuperacionUD2;

import java.util.Scanner;
public class Ejercicio5 {
	public static void imprimirArray(int [] arr) {
		System.out.println();
		for (int i=0;i<arr.length;i++)
			System.out.print("["+arr[i]+"]");
	}
	
	public static int [] generaCombinacion(int longitud) {
		int [] combinacionSecreta = new int[longitud];
		for (int i=0;i<combinacionSecreta.length;i++) {
			combinacionSecreta[i]=(int)(Math.random()*5+1);
		
	
		}
		return combinacionSecreta;
	}
	
	public static void generaIntento(int [] intento) {
		System.out.println();
		Scanner teclado = new Scanner(System.in);
		for (int i=0;i<intento.length;i++) {
			System.out.println("Introduzca número: ");
			intento[i]=teclado.nextInt();
			
		}
	}
	
	public static boolean ArraysIguales(int[] a1,int[]a2) {
		boolean iguales=true;
		for (int i=0;i<a1.length;i++) {
			if (a1[i]!=a2[i])
				iguales=false;
		}
		return iguales;
	}
	
	public static void damePistas(int [] secreto,int [] intento) {
		System.out.println();
		for (int i=0;i<secreto.length;i++) {
			if (secreto[i]==intento[i])
				System.out.print(" OK  ");
			else if(secreto[i]>intento[i])
				System.out.print(" MAYOR ");
			else if(secreto[i]<intento[i])
				System.out.print(" MENOR ");
				
		}
		
	}
	
	public static void main(String[] args) {
		
		int longitud=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca longitud: ");
		longitud=teclado.nextInt();
				
		int [] combinacionSecreta = generaCombinacion(longitud); 	
		imprimirArray(combinacionSecreta);
		
		int [] intento = new int[longitud];
		generaIntento(intento);
		imprimirArray(intento);
		
		while(!ArraysIguales(combinacionSecreta,intento)) {
			damePistas(combinacionSecreta, intento);
			imprimirArray(intento);
			generaIntento(intento);
		}
		
		System.out.println("ACERTASTE LA COMBINACIÓN.");
		
		
		
	}
}

