import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el color del círculo: ");
        String color = sc.nextLine();

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        
        circulo circulo = new circulo(color, radio);
        circulo.mostrarInfo();

        sc.close();
    }
}
