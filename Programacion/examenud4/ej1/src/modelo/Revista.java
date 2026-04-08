package examenud4.ej1.modelo;

public class Revista extends Publicacion{
    private int numero;

    public Revista(String titulo, int anyoPublicacion, String genero, int numero){
        super(titulo, anyoPublicacion, genero);
        this.nuemro = numero;
    }
    public int getNuemero(){
        return numero;
    }
    @Override
    public String getTipoPublicacion(){
        return "Revista";
    }
    @Override
    public String toString() {
        return "Revista [numero=" + numero + "]";
    }
}
