package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private final List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracion, String genero, String director) {
        super(titulo, duracion, genero);
        this.director = director;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PELÍCULA ===");
        imprimirInfoBase();
        System.out.println("Director: " + director);

        System.out.println("Actores:");
        for (Actor a : actores) {
            System.out.println(" - " + a);
        }
    }
}
