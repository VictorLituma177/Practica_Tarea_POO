package uni1a;

public class Cortometraje extends ContenidoAudiovisual {

    private boolean esAnimado;
    private String premio;

    public Cortometraje(String titulo, int duracion, String genero, boolean esAnimado) {
        super(titulo, duracion, genero);
        this.esAnimado = esAnimado;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== CORTOMETRAJE ===");
        imprimirInfoBase();
        System.out.println("Animación: " + (esAnimado ? "Sí" : "No"));
        System.out.println("Premio: " + (premio != null ? premio : "Ninguno"));
    }
}
