package EjerciciosRepaso_U1;
import java.util.Scanner;
public class Ejercicio1RafaelVegaLibrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
        int i = 0;
        int introduce;
        int lista = 1;
        int n=0;
        int negativo = 0;
        int positivo = 0;
        int cero = 0;
        int sumaPositivo;
        int sumaNegativo;
        int max =0,min=0;
        double media= 00f;
        long total = 0;

        
        System.out.println("Cuantos números vas a introducir");
        introduce = teclado.nextInt();
    
        while (n>=0 && i!=introduce){
            i++;
            System.out.print(+lista+"->");
            n = teclado.nextInt();
            lista++;
            
            if(introduce==1 ){
				min=n;
				max=n;
			}
			
			if (max<n) {
				max=n;
			}
			if (min>n) {
				min=n;
			}
            
            if (n >0){
                positivo++;
            }else if(n ==0){
                cero++;
            }else if(n <0){
                negativo++;
            }
            total = total + n;
        }
        media = total/introduce;
        System.out.println("Positivos:"+ positivo);
        System.out.println("Ceros:"+ cero);
        System.out.println("Negativos:"+ negativo);
        System.out.println("Maxima : " +max);
		System.out.println("Minima : " +min);
		System.out.println("Media :"+media);
	}

}
