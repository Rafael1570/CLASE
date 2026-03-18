public abstract class ItemMultimedia {

    protected String titulo;
    protected int anioLanzamiento;
    protected long tamanioEnBytes;

    public ItemMultimedia(String titulo, int anioLanzamiento, long tamanioEnBytes) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.tamanioEnBytes = tamanioEnBytes;
    }

    // Método abstracto
    public abstract void reproducir();

    // Método concreto
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anioLanzamiento);
        System.out.println("Tamaño (bytes): " + tamanioEnBytes);
    }
}