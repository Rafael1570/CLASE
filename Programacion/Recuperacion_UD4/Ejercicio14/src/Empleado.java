public class Empleado {

    private static Integer contador = 1;

    private Integer id;
    private String nombre;
    private String apellidos;
    private Double salario;

    public Empleado(String nombre, String apellidos, Double salario) {
        this.id = contador;
        contador++;

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", salario=" + salario +
                '}';
    }
}