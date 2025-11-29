package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {

    private String creador;
    private final List<Temporada> temporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracion, String genero, String creador) {
        super(titulo, duracion, genero);
        this.creador = creador;
    }

    public void crearTemporada(int numero, int cantidadEpisodios) {
        temporadas.add(new Temporada(numero, cantidadEpisodios));
    }

    private void mostrarTemporadas() {
        if (temporadas.isEmpty()) {
            System.out.println("No hay temporadas registradas.");
            return;
        }

        System.out.println("Temporadas:");
        for (Temporada t : temporadas) {
            System.out.println(" - " + t);
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== SERIE DE TV ===");
        imprimirInfoBase();
        System.out.println("Creador: " + creador);
        mostrarTemporadas();
    }
}
