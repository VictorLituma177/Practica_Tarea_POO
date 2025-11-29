package uni1a.utils;

import uni1a.*;
import java.util.*;
import java.io.IOException;

public class CargadorSeries {

    public static List<SerieDeTV> cargarSeries(String ruta) {
        List<SerieDeTV> lista = new ArrayList<>();

        try {
            List<String[]> filas = CsvManager.leerCSV(ruta);

            for (int i = 1; i < filas.size(); i++) {
                String[] f = filas.get(i);

                String titulo = f[0];
                int duracion = Integer.parseInt(f[1]);
                String genero = f[2];
                String creador = f[3];

                SerieDeTV serie = new SerieDeTV(titulo, duracion, genero, creador);
                lista.add(serie);
            }

        } catch (IOException e) {
            System.out.println("Error al cargar series: " + e.getMessage());
        }

        return lista;
    }
}
