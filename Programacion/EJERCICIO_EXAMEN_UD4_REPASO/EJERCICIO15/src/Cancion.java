public class Cancion extends ItemMultimedia implements ContenidoDescargable {

    private int duracionSegundos;

    public Cancion(String titulo, int anio, long tamanio, int duracionSegundos) {
        super(titulo, anio, tamanio);
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + titulo);
    }

    @Override
    public void descargar() {
        double megas = tamanioEnBytes / (1024.0 * 1024.0);
        System.out.println("Descargando canción: " + titulo + " - " + megas + " MB");
    }

    @Override
    public long obtenerTamanioEnBytes() {
        return tamanioEnBytes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Duración: " + duracionSegundos + " segundos");
    }
}