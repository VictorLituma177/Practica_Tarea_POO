package uni1a.view;

import java.util.Scanner;

public class VistaConsola {

    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("\n=== SISTEMA DE CONTENIDO AUDIOVISUAL ===");
        System.out.println("1. Listar todos los contenidos");
        System.out.println("2. Buscar contenido por título");
        System.out.println("3. Cargar datos desde CSV");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public String pedirTitulo() {
        System.out.print("Ingrese el título a buscar: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
