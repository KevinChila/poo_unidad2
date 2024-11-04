package uni1a;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        
        // Crear una película y agregar actores
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 47));
        pelicula.agregarActor(new Actor("Zoe Saldana", 46));
        contenidos[0] = pelicula;

        // Crear una serie de TV y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serie;

        // Crear un documental y agregar investigadores
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Neil deGrasse Tyson", "Astrophysics"));
        contenidos[2] = documental;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
