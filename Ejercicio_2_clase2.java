
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("productos.txt", true)
            );

            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad disponible: ");
            int cantidad = sc.nextInt();

            double total = precio * cantidad;

            escritor.write("Producto: " + nombre);
            escritor.newLine();

            escritor.write("Precio: " + precio);
            escritor.newLine();

            escritor.write("Cantidad: " + cantidad);
            escritor.newLine();

            escritor.write("Valor total: " + total);
            escritor.newLine();

            escritor.write("-------------------------");
            escritor.newLine();

            escritor.close();

            System.out.println("Valor total: " + total);
            System.out.println("Producto guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar el producto.");
        }

        sc.close();
    }
}
