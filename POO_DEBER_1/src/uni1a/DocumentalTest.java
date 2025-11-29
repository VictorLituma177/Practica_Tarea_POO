package uni1a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DocumentalTest {

    @Test
    public void testAgregarInvestigador() {
        Documental doc = new Documental("El Universo", 90, "Ciencia", "Astronomía");

        Investigador i1 = new Investigador("Dra. Vega", "NASA", "Astrofísica");

        doc.agregarInvestigador(i1);

        assertEquals("El Universo", doc.getTitulo());
        assertEquals("Ciencia", doc.getGenero());
    }

    @Test
    public void testCrearDocumental() {
        Documental doc = new Documental("Océanos", 80, "Naturaleza", "Fauna Marina");

        assertEquals(80, doc.getDuracionEnMinutos());
        assertEquals("Naturaleza", doc.getGenero());
    }
}
