public class Reserva {

    private static Integer contador = 1;

    private Integer id;
    private String nombreCliente;
    private String hora;
    private Double precio;

    public Reserva(String nombreCliente, String hora, Double precio) {
        this.id = contador;
        contador++;

        this.nombreCliente = nombreCliente;
        this.hora = hora;
        this.precio = precio;
    }
    
    public Integer getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getHora() {
        return hora;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", nombreCliente=" + nombreCliente + ", hora=" + hora + ", precio=" + precio + '}';
    }
}
