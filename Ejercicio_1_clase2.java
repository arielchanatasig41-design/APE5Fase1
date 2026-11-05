
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("estudiantes.txt")
            );

            for (int i = 1; i <= 3; i++) {
                System.out.println("Estudiante " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese la calificacion: ");
                double calificacion = sc.nextDouble();
                sc.nextLine();

                escritor.write(nombre);
                escritor.newLine();

                escritor.write(String.valueOf(calificacion));
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Datos guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
        }

        sc.close();
    }
}
