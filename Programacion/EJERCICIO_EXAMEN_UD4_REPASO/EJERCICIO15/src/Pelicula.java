public class Pelicula extends ItemMultimedia implements ContenidoDescargable {

    private int duracionMinutos;

    public Pelicula(String titulo, int anio, long tamanio, int duracionMinutos) {
        super(titulo, anio, tamanio);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
    }

    @Override
    public void descargar() {
        double megas = tamanioEnBytes / (1024.0 * 1024.0);
        System.out.println("Descargando película: " + titulo + " - " + megas + " MB");
    }

    @Override
    public long obtenerTamanioEnBytes() {
        return tamanioEnBytes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}