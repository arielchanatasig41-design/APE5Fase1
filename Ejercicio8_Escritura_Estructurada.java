
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("materias.txt"));

            escritor.write("Programacion");
            escritor.newLine();

            escritor.write("Matematicas");
            escritor.newLine();

            escritor.write("Fisica");
            escritor.newLine();

            escritor.write("Algebra");
            escritor.newLine();

            escritor.write("Ingles");
            escritor.newLine();

            escritor.close();

            System.out.println("Archivo creado correctamente.");

        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }
}
