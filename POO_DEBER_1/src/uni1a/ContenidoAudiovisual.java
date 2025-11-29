package uni1a;

public abstract class ContenidoAudiovisual implements Mostrable {

    private static int contador = 1;

    private final int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contador++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método reutilizable para imprimir la información básica.
     * Evita duplicar código en las clases hijas.
     */
    protected void imprimirInfoBase() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracionEnMinutos + " min");
        System.out.println("Género: " + genero);
    }

    /** 
     * Cada clase hija implementa su propia versión.
     */
    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return titulo + " (" + genero + ")";
    }
}
