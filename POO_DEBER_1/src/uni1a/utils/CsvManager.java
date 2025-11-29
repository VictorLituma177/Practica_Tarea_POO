package uni1a.utils;

import java.io.*;
import java.util.*;

public class CsvManager {

	public static List<String[]> leerCSV(String ruta) throws IOException {
	    List<String[]> datos = new ArrayList<>();
	    BufferedReader br = new BufferedReader(new FileReader(ruta));

	    String linea;
	    while ((linea = br.readLine()) != null) {
	        if (!linea.trim().isEmpty()) {
	            datos.add(linea.split(","));   // ESTO RETORNA String[]
	        }
	    }

	    br.close();
	    return datos;
	}


    public static void escribirCSV(String ruta, List<String[]> datos) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        for (String[] fila : datos) {
            bw.write(String.join(",", fila));
            bw.newLine();
        }

        bw.close();
    }
}
