import java.util.Comparator;

public class ComparadorTotal implements Comparator<Pedido> {

    @Override
    public int compare(Pedido pedido1, Pedido pedido2) {
        return Double.compare(pedido1.calcularTotal(), pedido2.calcularTotal());
    }
}