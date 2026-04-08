package examenud4.ej1.gestor;

import java.util.Comparator;
import examenud4.ej1.modelo.Publicacion;
public class ordenarportitulo implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2){
        return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
    }
}

