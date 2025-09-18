import java.util.Scanner;
public class MainAnimales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Animales animales = null;
        Perro perro = null;
        
    do {
        System.out.println("Menu:"); 
        System.out.println("1. ingresar animal");
        System.out.println("2. ingresar perro");
        System.out.println("3. mostrar animales");
        System.out.println("4. mostrar perros");
        System.out.println("5. salir");
        System.out.print("ingrese la opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del animal: ");
                String nombreAnimal = scanner.next();
                System.out.print("Ingrese la edad del animal: ");
                int edadAnimal = scanner.nextInt();
                animales = new Animales(nombreAnimal, edadAnimal);
                break;
            case 2:
                System.out.print("Ingrese el nombre del perro: ");
                String nombrePerro = scanner.next();
                System.out.print("Ingrese la edad del perro: ");
                int edadPerro = scanner.nextInt();
                System.out.print("ingrese la raza del perro: ");
                String razaPerro = scanner.next();
                perro = new Perro(nombrePerro, edadPerro, razaPerro);
                break;
            case 3:
                if (animales != null) {
                    animales.mostrarInfo();
                } else {
                    System.out.println("No hay animales ingresados.");
                }
                break;
            case 4:
                if (perro != null) {
                    perro.mostrarInfo();
                } else {
                    System.out.println("No hay perros ingresados.");
                }
                break;
            default:
                break;
            }
        
        
    } while (opcion != 5);

    scanner.close();
    }

}

