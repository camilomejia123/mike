import java.util.ArrayList;
import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Productos> listaProductos = new ArrayList<>();
        ArrayList<Alimentos> listaAlimentos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Agregar alimento");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar alimentos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    int precio = scanner.nextInt();
                    listaProductos.add(new Productos(nombre, precio));
                    System.out.println("✅ Producto agregado con éxito.");
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del alimento: ");
                    String nombreAlimento = scanner.nextLine();
                    System.out.print("Ingrese el precio del alimento: ");
                    int precioAlimento = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
                    String fechaVencimiento = scanner.nextLine();
                    listaAlimentos.add(new Alimentos(nombreAlimento, precioAlimento, fechaVencimiento));
                    System.out.println("Alimento agregado con éxito.");
                }
                case 3 -> {
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE PRODUCTOS ---");
                        for (Productos p : listaProductos) {
                            p.mostrarInfo();
                        }
                    }
                }
                case 4 -> {
                    if (listaAlimentos.isEmpty()) {
                        System.out.println(" No hay alimentos registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE ALIMENTOS ---");
                        for (Alimentos a : listaAlimentos) {
                            a.mostrarInformacion();
                        }
                    }
                }
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
