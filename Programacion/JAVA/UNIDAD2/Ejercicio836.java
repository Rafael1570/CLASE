    /*
Ejercicio propuesto 8.3.6:
Calcular el promedio de calificaciones.

Escribe un programa en Java que calcule el promedio de un conjunto de calificaciones.
Debes crear un método llamado calcularPromedio que tome un array de calificaciones
como argumento y devuelva el promedio de las calificaciones.

Luego, en el método main, crea un array de calificaciones, llama al método
calcularPromedio y muestra el resultado en la consola.
*/

public class Ejercicio836 {

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public static void main(String[] args) {

        double[] notas = {8.5, 7.0, 9.3, 6.8, 10.0};
        
        double promedio = calcularPromedio(notas);

        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}   

