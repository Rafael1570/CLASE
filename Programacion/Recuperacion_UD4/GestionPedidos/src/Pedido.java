public class Pedido {

    private static Integer contadorPedidos = 1;

    private Integer id;
    private String nombreProducto;
    private Integer cantidad;
    private Double precioUnitario;

    public Pedido(String nombreProducto, Integer cantidad, Double precioUnitario) {
        this.id = contadorPedidos;
        contadorPedidos++;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Integer getId() {
        return id;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double calcularTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    } 
}

