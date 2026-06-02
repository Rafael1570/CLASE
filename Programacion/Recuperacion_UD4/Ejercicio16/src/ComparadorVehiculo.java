import java.util.Comparator;

public class ComparadorVehiculo implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {

        int comparacionMarca =
                vehiculo1.getMarca().compareToIgnoreCase(vehiculo2.getMarca());

        if (comparacionMarca != 0) {
            return comparacionMarca;
        }

        int comparacionModelo =
                vehiculo1.getModelo().compareToIgnoreCase(vehiculo2.getModelo());

        if (comparacionModelo != 0) {
            return comparacionModelo;
        }

        return vehiculo1.getMatricula()
                .compareToIgnoreCase(vehiculo2.getMatricula());
    }
}