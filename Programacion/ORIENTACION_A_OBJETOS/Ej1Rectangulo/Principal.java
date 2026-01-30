
public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r2 = new Rectangulo(3,10);

        int arearectangulo1 = r1.calcularArea();
        System.out.println("El area del primer rectangulo es"+arearectangulo1);
        int arearectangulo2 = r2.calcularArea();
        System.out.println("El area del primer rectangulo es"+arearectangulo2);
        int perimetrorectangulo1 = r1.calcularPerimetro();
        System.out.println("El perimetro del primer rectangulo es: "+perimetrorectangulo1);
        int perimetrorectangulo2 = r2.calcularPerimetro();
        System.out.println("El perimetro del primer rectangulo es: "+perimetrorectangulo2);
    }
}

