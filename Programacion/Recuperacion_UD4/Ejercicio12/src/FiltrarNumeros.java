import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FiltrarNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(8);
        numeros.add(-4);
        numeros.add(15);
        numeros.add(-9);
        numeros.add(0);
        numeros.add(21);
        numeros.add(-2);

        System.out.println("lista antes de eliminar los números negativos:");
        System.out.println(numeros);

        ListIterator<Integer> iterador = numeros.listIterator();

        while (iterador.hasNext()) {

            Integer numero = iterador.next();

            if (numero < 0) {
                iterador.remove();
            }
        }

        System.out.println("lista después de eliminar los números negativos:");
        System.out.println(numeros);
    }
}
