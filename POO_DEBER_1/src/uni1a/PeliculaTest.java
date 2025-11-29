package uni1a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PeliculaTest {

    @Test
    public void testAgregarActores() {
        Pelicula peli = new Pelicula("Matrix", 136, "Acción", "Wachowski");

        Actor a1 = new Actor("Keanu Reeves", 58, "Estados Unidos");
        Actor a2 = new Actor("Carrie-Anne Moss", 55, "Canadá");

        peli.agregarActor(a1);
        peli.agregarActor(a2);

        assertEquals("Matrix", peli.getTitulo());
    }

    @Test
    public void testCrearPelicula() {
        Pelicula p = new Pelicula("Avatar", 162, "Fantasía", "James Cameron");

        assertEquals("Avatar", p.getTitulo());
        assertEquals(162, p.getDuracionEnMinutos());
        assertEquals("Fantasía", p.getGenero());
    }
}
