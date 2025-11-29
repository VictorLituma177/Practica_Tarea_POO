package uni1a.controller;

import java.util.List;

import uni1a.*;
import uni1a.utils.*;
import uni1a.view.VistaConsola;

public class Controlador {

    private final GestorContenido gestor = new GestorContenido();
    private final VistaConsola vista = new VistaConsola();

    public void iniciar() {

        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenuPrincipal();

            switch (opcion) {
                case 1:
                    listarContenidos();
                    break;

                case 2:
                    buscarPorTitulo();
                    break;

                case 3:
                    cargarDesdeCSV();
                    break;

                case 4:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    continuar = false;
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void listarContenidos() {
        if (gestor.getContenidos().isEmpty()) {
            vista.mostrarMensaje("No hay contenidos cargados.");
            return;
        }

        vista.mostrarMensaje("=== LISTA DE CONTENIDOS ===");
        for (ContenidoAudiovisual c : gestor.getContenidos()) {
            c.mostrarDetalles();
            System.out.println("------------------------");
        }
    }

    private void buscarPorTitulo() {
        String titulo = vista.pedirTitulo();
        ContenidoAudiovisual encontrado = gestor.buscarPorTitulo(titulo);

        if (encontrado == null) {
            vista.mostrarMensaje("No se encontró contenido con ese título.");
        } else {
            vista.mostrarMensaje("Contenido encontrado:");
            encontrado.mostrarDetalles();
        }
    }

    private void cargarDesdeCSV() {

        vista.mostrarMensaje("Cargando películas...");
        List<Pelicula> peliculas = CargadorPeliculas.cargarPeliculas("src/datos/peliculas.csv");
        peliculas.forEach(gestor::agregarContenido);

        vista.mostrarMensaje("Cargando series...");
        List<SerieDeTV> series = CargadorSeries.cargarSeries("src/datos/series.csv");
        series.forEach(gestor::agregarContenido);

        vista.mostrarMensaje("Cargando documentales...");
        List<Documental> documentales = CargadorDocumentales.cargarDocumentales("src/datos/documentales.csv");
        documentales.forEach(gestor::agregarContenido);

        vista.mostrarMensaje("Carga completada.");
    }
}
