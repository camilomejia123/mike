public class empleado {

    private String nombreCargo;
    private int experiencia;
    private double salario;

    public empleado(String nombreCargo, int experiencia, double salario) {
        this.nombreCargo = nombreCargo;
        this.experiencia = experiencia;
        this.salario = salario;
    }


    public String obtenerCargo() {
        return nombreCargo;
    }

    public int obtenerExperiencia() {
        return experiencia;
    }

    public double obtenerSalario() {
        return salario;
    }

    public void imprimirDetalles() {
        System.out.println("=== Información del Empleado ===");
        System.out.println("Cargo: " + nombreCargo);
        System.out.println("Años de experiencia: " + experiencia);
        System.out.println("Salario base: $" + salario);
    }
}
