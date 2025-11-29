package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private final List<Investigador> investigadores = new ArrayList<>();

    public Documental(String titulo, int duracion, String genero, String tema) {
        super(titulo, duracion, genero);
        this.tema = tema;
    }

    public void agregarInvestigador(Investigador inv) {
        investigadores.add(inv);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== DOCUMENTAL ===");
        imprimirInfoBase();
        System.out.println("Tema: " + tema);

        System.out.println("Investigadores:");
        for (Investigador i : investigadores) {
            System.out.println(" - " + i);
        }
    }
}
