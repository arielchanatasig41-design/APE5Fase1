
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("ventas.txt", true)
            );

            while (true) {
                System.out.print("Nombre del producto (fin para terminar): ");
                String nombre = sc.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                System.out.print("Cantidad vendida: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double total = subtotal - descuento;
                acumulado += total;

                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento: " + descuento);
                System.out.println("Total a pagar: " + total);

                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: " + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: " + subtotal);
                escritor.newLine();

                escritor.write("Descuento: " + descuento);
                escritor.newLine();

                escritor.write("Total: " + total);
                escritor.newLine();

                escritor.write("-------------------------");
                escritor.newLine();
            }

            escritor.write("Total acumulado: " + acumulado);
            escritor.newLine();
            escritor.write("=========================");
            escritor.newLine();

            escritor.close();

            System.out.println("Total acumulado: " + acumulado);
            System.out.println("Ventas guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar las ventas.");
        }

        sc.close();
    }
}
