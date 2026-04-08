package examenud4.ej2.modelo;
public class Producto {
    private static int contador = 1;

    private Integer id;
    private String nombre;
    private Boolean agotado;

    public Producto(String nombre){
        this.id = contador++;
        this.nombre = nombre;
        this.agotado = false;
    }
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Boolean getAgotado(){
        return agotado;
    }
    public void setAgotado(Boolean agotado){
        this.agotado = agotado;
    }
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", agotado=" + agotado + "]";
    }
}
