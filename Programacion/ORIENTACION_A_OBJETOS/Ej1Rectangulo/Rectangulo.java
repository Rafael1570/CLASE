public class Rectangulo {
    
    //Atributos
    int ancho;
    int alto;
    //Contructores
    public Rectangulo(int anc, int alt){
        ancho = anc;
        alto = alt;
    }
    


    //Metodos
    public int calcularArea(){
        int area=ancho*alto;
        return area;
    }
    public int calcularPerimetro(){
        int perimetro=2*ancho+2*alto;
        return perimetro;
    }
}
