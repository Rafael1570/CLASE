package examenud4.ej1.modelo;
public abstract class Publicacion {
    private static int contador = 1;

    private Integer id;
    private String titulo;
    private int anyoPublicacion;
    private String genero;

    public Publicacion(String titulo, int anyoPublicacion, String genero){
        this.id=contador++;
        this.titulo = titulo;
        this.anyoPublicacion = anyoPublicacion;
        this.genero = genero;        
    }
    public Integer getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnyoPublicacion(){
        return anyoPublicacion;
    }
    public String getGenero(){
        return genero;
    }
    public abstract String getTipoPublicacion();

    @Override
    public String toString(){
            return "id=" +id+", titulo='"+titulo+", Genero= "+genero+".";
    }
}
