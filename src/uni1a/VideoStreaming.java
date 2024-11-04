package uni1a;

public class VideoStreaming extends ContenidoAudiovisual {
    private String plataforma;
    private boolean esExclusivo;

    public VideoStreaming(String titulo, int duracionEnMinutos, String genero, String plataforma, boolean esExclusivo) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.esExclusivo = esExclusivo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video streaming:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Exclusivo: " + (esExclusivo ? "Sí" : "No"));
    }
}
