package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracion, String genero, String canal, int likes) {
        super(titulo, duracion, genero);
        this.canal = canal;
        this.likes = likes;
    }

    public void darLike() {
        likes++;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== VIDEO YOUTUBE ===");
        imprimirInfoBase();
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
    }
}
