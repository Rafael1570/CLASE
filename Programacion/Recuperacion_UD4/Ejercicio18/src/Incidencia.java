public class Incidencia {

    private static Integer contador = 1;

    private Integer id;
    private String descripcion;

    public Incidencia(String descripcion) {
        this.id = contador;
        contador++;

        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}