package uni1a;

public class Investigador {

    private String nombre;
    private String institucion;
    private String especialidad;

    public Investigador(String nombre, String institucion, String especialidad) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + institucion + " (" + especialidad + ")";
    }
}
