package uni1a.utils;

import uni1a.*;
import java.util.*;
import java.io.IOException;

public class CargadorDocumentales {

    public static List<Documental> cargarDocumentales(String ruta) {
        List<Documental> lista = new ArrayList<>();

        try {
            List<String[]> filas = CsvManager.leerCSV(ruta);

            for (int i = 1; i < filas.size(); i++) {
                String[] f = filas.get(i);

                String titulo = f[0];
                int duracion = Integer.parseInt(f[1]);
                String genero = f[2];
                String tema = f[3];

                Documental d = new Documental(titulo, duracion, genero, tema);
                lista.add(d);
            }

        } catch (IOException e) {
            System.out.println("Error al cargar documentales: " + e.getMessage());
        }

        return lista;
    }
}
