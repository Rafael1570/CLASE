package EjerciciosExamenRecuperacionUD2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < numero.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            if (numeroAleatorio == 0) {
                numeroAleatorio++;
            }else if (numeroAleatorio==100) {
                numeroAleatorio--;
            }
            numero[i] = numeroAleatorio;
            cuadrado[i] = numeroAleatorio * numeroAleatorio;
            cubo[i] = numeroAleatorio * numeroAleatorio * numeroAleatorio;
            System.out.println(numero[i] + " "+ cuadrado[i] + " " + cubo[i]);
        }

    }
}
