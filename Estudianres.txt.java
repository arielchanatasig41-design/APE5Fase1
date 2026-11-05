import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class EscribirEstudiantes {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");
 
        if (!archivo.exists()) {
            System.out.println("El archivo estudiantes.txt debe existir previamente.");
            return;
        }
 
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Escriba un mensaje: ");
        String mensaje = teclado.nextLine();
 
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.write(mensaje + System.lineSeparator());
            escritor.close();
 
            System.out.println("La informacion se guardo correctamente.");
 
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir en el archivo.");
            e.printStackTrace();
        } finally {
            teclado.close();
        }
    }
}