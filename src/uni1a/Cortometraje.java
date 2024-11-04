package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private int anio;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, int anio) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.anio = anio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("Año: " + anio);
    }
}
