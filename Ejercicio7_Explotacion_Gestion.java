
import java.io.File;
import java.io.IOException;

public class Ejercicio7 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        try {
            // Crear carpeta si no existe
            archivo.getParentFile().mkdirs();

            // Comprobar si existe
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                // Crear archivo
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            }

            // Mostrar informacion
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getPath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
