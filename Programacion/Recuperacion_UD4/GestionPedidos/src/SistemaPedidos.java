import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaPedidos {

    private Map<String, List<Pedido>> pedidosActivos;
    private List<Pedido> pedidosServidos;
    private Scanner teclado;

    public SistemaPedidos() {
        pedidosActivos = new HashMap<>();
        pedidosServidos = new ArrayList<>();
        teclado = new Scanner(System.in);
    }

    public void registrarPedido() {

        System.out.println("introduce la mesa:");
        String mesa = teclado.nextLine();

        System.out.println("introduce el nombre del producto:");
        String nombreProducto = teclado.nextLine();

        System.out.println("introduce la cantidad:");
        Integer cantidad = Integer.parseInt(teclado.nextLine());

        System.out.println("introduce el precio unitario:");
        Double precioUnitario = Double.parseDouble(teclado.nextLine());

        Pedido nuevoPedido = new Pedido(nombreProducto, cantidad, precioUnitario);

        if (!pedidosActivos.containsKey(mesa)) {
            pedidosActivos.put(mesa, new ArrayList<>());
        }

        pedidosActivos.get(mesa).add(nuevoPedido);

        System.out.println("pedido registrado correctamente");
    }

    public void mostrarPedidosActivos() {

        if (pedidosActivos.isEmpty()) {
            System.out.println("no hay pedidos activos");
        } else {

            for (Map.Entry<String, List<Pedido>> entrada : pedidosActivos.entrySet()) {

                System.out.println("mesa: " + entrada.getKey());

                for (Pedido pedido : entrada.getValue()) {
                    System.out.println(pedido);
                    System.out.println("total: " + pedido.calcularTotal());
                }

                System.out.println();
            }
        }
    }

    public void buscarPedido(Integer id) {

        boolean encontrado = false;

        for (Map.Entry<String, List<Pedido>> entrada : pedidosActivos.entrySet()) {

            for (Pedido pedido : entrada.getValue()) {

                if (pedido.getId().equals(id)) {

                    System.out.println("pedido encontrado");
                    System.out.println("mesa: " + entrada.getKey());
                    System.out.println(pedido);
                    System.out.println("total: " + pedido.calcularTotal());

                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            System.out.println("no se ha encontrado el pedido");
        }
    }

    public void servirPedido(Integer id) {

        boolean encontrado = false;

        for (Map.Entry<String, List<Pedido>> entrada : pedidosActivos.entrySet()) {

            List<Pedido> listaPedidos = entrada.getValue();

            Iterator<Pedido> iterador = listaPedidos.iterator();

            while (iterador.hasNext()) {

                Pedido pedido = iterador.next();

                if (pedido.getId().equals(id)) {

                    pedidosServidos.add(pedido);

                    iterador.remove();

                    encontrado = true;

                    System.out.println("pedido servido correctamente");

                    break;
                }
            }

            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            System.out.println("no se ha encontrado el pedido");
        }
    }

    public void mostrarPedidosServidos() {

        if (pedidosServidos.isEmpty()) {
            System.out.println("no hay pedidos servidos");
        } else {

            System.out.println("pedidos servidos:");

            for (Pedido pedido : pedidosServidos) {
                System.out.println(pedido);
                System.out.println("total: " + pedido.calcularTotal());
            }
        }
    }

    public void mostrarPedidosOrdenadosPorTotal() {

        List<Pedido> pedidosOrdenados = new ArrayList<>();

        for (Map.Entry<String, List<Pedido>> entrada : pedidosActivos.entrySet()) {
            pedidosOrdenados.addAll(entrada.getValue());
        }

        if (pedidosOrdenados.isEmpty()) {
            System.out.println("no hay pedidos activos");
        } else {

            pedidosOrdenados.sort(new ComparadorTotal());

            System.out.println("pedidos ordenados por precio total:");

            for (Pedido pedido : pedidosOrdenados) {
                System.out.println(pedido);
                System.out.println("total: " + pedido.calcularTotal());
            }
        }
    }

    public void eliminarMesasVacias() {

        Iterator<Map.Entry<String, List<Pedido>>> iterador = pedidosActivos.entrySet().iterator();

        while (iterador.hasNext()) {

            Map.Entry<String, List<Pedido>> entrada = iterador.next();

            if (entrada.getValue().isEmpty()) {
                iterador.remove();
            }
        }

        System.out.println("mesas vacías eliminadas correctamente");
    }

    public void calcularRecaudacion() {

        Double recaudacionTotal = 0.0;

        for (Pedido pedido : pedidosServidos) {
            recaudacionTotal += pedido.calcularTotal();
        }

        System.out.println("recaudación total: " + recaudacionTotal + " €");
    }

    public void ejecutarMenu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("===== sistema de pedidos =====");
            System.out.println("1. registrar pedido");
            System.out.println("2. mostrar pedidos activos");
            System.out.println("3. buscar pedido por id");
            System.out.println("4. servir pedido");
            System.out.println("5. mostrar pedidos servidos");
            System.out.println("6. mostrar pedidos ordenados por precio total");
            System.out.println("7. eliminar mesas vacías");
            System.out.println("8. calcular recaudación");
            System.out.println("0. salir");
            System.out.println("selecciona una opción:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:
                    registrarPedido();
                    break;

                case 2:
                    mostrarPedidosActivos();
                    break;

                case 3:
                    System.out.println("introduce el id del pedido:");
                    Integer idBuscar = Integer.parseInt(teclado.nextLine());

                    buscarPedido(idBuscar);
                    break;

                case 4:
                    System.out.println("introduce el id del pedido:");
                    Integer idServir = Integer.parseInt(teclado.nextLine());

                    servirPedido(idServir);
                    break;

                case 5:
                    mostrarPedidosServidos();
                    break;

                case 6:
                    mostrarPedidosOrdenadosPorTotal();
                    break;

                case 7:
                    eliminarMesasVacias();
                    break;

                case 8:
                    calcularRecaudacion();
                    break;

                case 0:
                    System.out.println("programa finalizado");
                    break;

                default:
                    System.out.println("opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    public static void main(String[] args) {

        SistemaPedidos sistema = new SistemaPedidos();

        sistema.ejecutarMenu();
    }
}