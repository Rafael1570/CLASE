import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TransformarCadenas {

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();

        palabras.add("java");
        palabras.add("programación");
        palabras.add("colecciones");
        palabras.add("iterator");
        palabras.add("visual studio code");

        System.out.println("lista antes de modificar:");
        System.out.println(palabras);

        ListIterator<String> iterador = palabras.listIterator();

        while (iterador.hasNext()) {

            String palabra = iterador.next();

            iterador.set(palabra.toUpperCase());
        }

        System.out.println("lista después de modificar:");
        System.out.println(palabras);
    }
}