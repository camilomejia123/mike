public class mainEmpleado {
    public static void main(String[] args) {

        empleado empleado1 = new empleado("Carlos Pérez", 8, 2500.0);

        gerente gerente1 = new gerente("Ana Torres", 15, 4000.0, "Recursos Humanos");

        // Mostrar detalles de ambos
        empleado1.imprimirDetalles();
        System.out.println("--------------------------");
        gerente1.imprimirDetalles();
    }
}
