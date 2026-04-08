package examenud4.ej2.gestor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import examenud4.ej2.modelo.Producto;

public class SistemaGestionProductos {
    private Map<String, ArrayList<Producto>> productosPorTipo;
    private Set<Producto> historicoAgotados;

    public SistemaGestionProductos(){
        productosPorTipo = new HashMap<>();
        historicoAgotados = new HashSet<>();

        productosPorTipo.put("Alimentacion", new ArrayList<>());
        productosPorTipo.put("Tecnologia", new ArrayList<>());
    }
    public Map<String, ArrayList<Producto>> getProductosPorTipo() {
        return productosPorTipo;
    }
    public Set<Producto> getHistoricoAgotados() {
        return historicoAgotados;
    }
    public void mostrarProductos(){
        Iterator<Map.Entry<String, ArrayList<Producto>>> itMapa = productosPorTipo.entrySet().iterator();
        while ( itMapa.hasNext()){
            Map.Entry<String, ArrayList<Producto>> entrada = itMapa.next();

            System.out.println("tipo: "+entrada.getKey());
            System.out.println("productos disponibles:");

            Iterator<Producto> itLista = entrada.getValue().iterator();
            boolean hayDisponibles = false;

            while (itLista.hasNext()){
                Producto p = itLista.next();
                if (!p.getAgotado()) {
                    System.out.println(p);
                    hayDisponibles = true;
                }
            }
            if (!hayDisponibles){
                System.out.println("no hay productos disponibles.");
            }
            System.out.println("Productos agotados: ");
            itLista = entrada.getValue().iterator();
            boolean hayAgotados = false;

            while (itLista.hasNext()) {
                Producto p = itList.next();
                if (p.getAgotado()){
                    system.out.println(p);
                    hayAgotados= true;
                }
            }
            if (!hayAgotados) {
                System.out.println("No hay productos agotados");
            }
        }
    }
    public void eliminarProductos(int id) {
        Iterator<Map.Entry<String, ArrayList<Producto>>> itMapa = productosPorTipo.entrySet().iterator();
        while (itMapa.hasNext()) {
            Map.Entry<String, ArrayList<Producto>> entrada = itMapa.next();
            Iterator<Producto> itLista = entrada.getValue().iterator();
            while (itLista.hasNext()) {
                Producto p = itLista.next();
                if (p.getId() == id) {
                    if (p.getAgotado()) {
                        historicoAgotados.add(p);
                    }
                    itLista.remove();
                }
            }
        }
    }
    public void marcarProductoComoAgotado(int id) {
        Iterator<Map.Entry<String, ArrayList<Producto>>> itMapa = productosPorTipo.entrySet().iterator();
        while (itMapa.hasNext()) {
            Map.Entry<String, ArrayList<Producto>> entrada = itMapa.next();
            Iterator<Producto> itLista = entrada.getValue().iterator();
            while (itLista.hasNext()) {
                Producto p = itLista.next();
                if (p.getId() == id) {
                    p.setAgotado(true);
                    historicoAgotados.add(p);
                } else if (!idProductoExiste(id)) {
                    System.out.println("No existe ningún producto con el ID proporcionado.");
                }
            }
        }
    }
    public void mostrarHistorico(){
        System.out.println("Historico: ");
        for (Producto p : historicoAgotados) {
            System.out.println(p);
        }
    }
    public void liimpiarHistorico() {
        Iterator<Map.Entry<String, ArrayList<Prodcuto>>> itMapa = prodcutosPorTipo.entrySet().iterator();
        while (itMapa.hasNext()) {
            Map.Entry<String, ArrayList<Producto>> entrada = itMapa.next();
            Iterator<Producto> itLista = entrada.getValue().iterator();
            while (itLista.hasNext()) {
                Producto p = itLista.next();
                if (p.getAgotado()) {
                    itLista.remove();
                }
            }
        }
        historicoAgotados.clear();
        System.out.println("Stock limpiado. Productos agotados eliminados y histórico vaciado.");
    }
}
