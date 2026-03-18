public class Libro extends ItemMultimedia implements ContenidoDescargable {

    private int numPaginas;

    public Libro(String titulo, int anio, long tamanio, int numPaginas) {
        super(titulo, anio, tamanio);
        this.numPaginas = numPaginas;
    }

    @Override
    public void reproducir() {
        System.out.println("Mostrando contenido del libro: " + titulo);
    }

    @Override
    public void descargar() {
        double megas = tamanioEnBytes / (1024.0 * 1024.0);
        System.out.println("Descargando libro: " + titulo + " - " + megas + " MB");
    }

    @Override
    public long obtenerTamanioEnBytes() {
        return tamanioEnBytes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de páginas: " + numPaginas);
    }
}