package uni1a;

import java.util.ArrayList;
import java.util.List;

public class GestorContenido {

    private final List<ContenidoAudiovisual> contenidos = new ArrayList<>();

    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    public ContenidoAudiovisual buscarPorTitulo(String titulo) {
        for (ContenidoAudiovisual c : contenidos) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                return c;
            }
        }
        return null;
    }

    public ContenidoAudiovisual buscarPorId(int id) {
        for (ContenidoAudiovisual c : contenidos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
