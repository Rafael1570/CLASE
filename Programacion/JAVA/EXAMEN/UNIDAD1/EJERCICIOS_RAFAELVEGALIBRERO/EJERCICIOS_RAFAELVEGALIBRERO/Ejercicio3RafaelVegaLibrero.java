package EjerciciosRepaso_U1;
import java.util.Scanner;
public class Ejercicio3RafaelVegaLibrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int minutos;
		int tipodia;
		int perdido;
		int precioperder = 20;
		float precio1 = 00f;
		float base = 1.20f;
		float precio2 = 00f;
		float adicional = 1.0f;
		float total = 00f;
		float finde = 00f;
		float IVA = 00f;
		float TOTAL = 00;
		
		System.out.println("Minutos estacionados:");
		minutos = teclado.nextInt();
		System.out.println("Tipo de día (1=Laboral, 2=Fin de semana):");
		tipodia = teclado.nextInt();
		System.out.println("Ha perdido el ticket [Sí(1)/No(2)]");
		perdido = teclado.nextInt();
		System.out.println("--RECIBO---");
		System.out.println("Minutos:"+minutos);
		
		int horaAdicional = 0;
		int mediasHoras = minutos/30;
		if (minutos % 30 !=0) {
			mediasHoras++;
		}else {
			horaAdicional++;
		}
		System.out.println("Tramo hasta 2h: "+mediasHoras+ " medias horas x 1,20€ ="+(precio1=mediasHoras*base));
		System.out.println("Tramo adicional: "+horaAdicional+"medias horas x 1€ ="+(precio2=horaAdicional*adicional));
		System.out.println("Base imponible ="+(total=precio1+precio2));
		if (tipodia == 2) {
			finde = total * 0.1f;
			System.out.println("Recargo fin de semana (10%):"+finde);
		}else {
			System.out.println("Recargo fin de semana (10%): 0.00€");
		}
		if (perdido == 1) {
			System.out.println("Recargo pérdida: "+precioperder);
		}else {
			System.out.println("Recargo pérdida: 0,00 €");
		}
		float sumaRecargos = finde + precioperder; 
		IVA = (total + sumaRecargos)*0.21f;
		System.out.println("IVA (21%):"+IVA);
		TOTAL = IVA + total;
		System.out.println("TOTAL: "+TOTAL);
		
	}

}
