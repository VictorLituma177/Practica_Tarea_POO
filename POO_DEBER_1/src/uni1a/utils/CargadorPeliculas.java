package uni1a.utils;

import uni1a.*;
import java.util.*;
import java.io.IOException;

public class CargadorPeliculas {

    public static List<Pelicula> cargarPeliculas(String ruta) {
        List<Pelicula> lista = new ArrayList<>();

        try {
            List<String[]> filas = CsvManager.leerCSV(ruta);

            for (int i = 1; i < filas.size(); i++) {
                String[] f = filas.get(i);

                String titulo = f[0];
                int duracion = Integer.parseInt(f[1]);
                String genero = f[2];
                String director = f[3];

                Pelicula p = new Pelicula(titulo, duracion, genero, director);
                lista.add(p);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de películas: " + e.getMessage());
        }

        return lista;
    }
}
