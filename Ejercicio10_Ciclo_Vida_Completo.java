
import java.io.File;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) {
        File archivo = new File("datos/temporal.txt");

        try {
            // Crear carpeta si no existe
            archivo.getParentFile().mkdirs();

            // Comprobar existencia
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            }

            // Confirmacion de borrado
            boolean confirmarBorrado = true;

            if (confirmarBorrado) {
                boolean resultado = archivo.delete();

                System.out.println(
                        "Resultado de eliminacion: " + resultado);
            } else {
                System.out.println("Borrado cancelado.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
