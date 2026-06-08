package examenud4.modelo;

public class Reserva {

    private String codigo;
    private String cliente;
    private int noches;
    private boolean confirmada;

    public Reserva(String codigo, String cliente, int noches, boolean confirmada) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.noches = noches;
        this.confirmada = confirmada;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNoches() {
        return noches;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    @Override
    public String toString() {
                        return "Reserva{" +
                        "codigo='" + codigo + '\'' +
                        ", cliente='" + cliente + '\'' +
                        ", noches=" + noches +
                        ", confirmada=" + confirmada +
                        '}';
    }
}
