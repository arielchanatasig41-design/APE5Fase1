
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("materias.txt", true));

            escritor.write("Base de Datos");
            escritor.newLine();

            escritor.write("Programacion Orientada a Objetos");
            escritor.newLine();

            escritor.close();

            System.out.println("Asignaturas agregadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }
}
