package examenud4.ej1.modelo;

public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo, int anyoPublicacion, String genero, String autor){
        super(titulo, anyoPublicacion, genero);
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    @Override
    public String getTipoPublicacion(){
        return "Libro";
    }

    @Override
    public String toString() {
        return "Libro [autor=" + autor + "]";
    }
}
