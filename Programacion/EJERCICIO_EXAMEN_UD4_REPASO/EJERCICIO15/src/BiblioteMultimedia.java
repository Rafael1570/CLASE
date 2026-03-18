public class BiblioteMultimedia {
        public static void main(String[] args) {

        Cancion c = new Cancion("Shape of You", 2017, 5000000, 240);
        Pelicula p = new Pelicula("Inception", 2010, 2000000000, 148);
        Libro l = new Libro("El Quijote", 1605, 3000000, 863);

        // Canción
        c.mostrarInformacion();
        c.reproducir();
        c.descargar();
        System.out.println("Tamaño real: " + c.obtenerTamanioEnBytes());
        System.out.println();

        // Película
        p.mostrarInformacion();
        p.reproducir();
        p.descargar();
        System.out.println("Tamaño real: " + p.obtenerTamanioEnBytes());
        System.out.println();

        // Libro
        l.mostrarInformacion();
        l.reproducir();
        l.descargar();
        System.out.println("Tamaño real: " + l.obtenerTamanioEnBytes());
    }
}
