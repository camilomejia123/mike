public class gerente extends empleado {
    private String areaResponsable;


    public gerente(String cargo, int experiencia, double salario, String areaResponsable) {
        super(cargo, experiencia, salario);
        this.areaResponsable = areaResponsable;
    }

    public String obtenerAreaResponsable() {
        return areaResponsable;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("=== Información del Gerente ===");
        System.out.println("Cargo: " + obtenerCargo());
        System.out.println("Años de experiencia: " + obtenerExperiencia());
        System.out.println("Salario base: $" + obtenerSalario());
        System.out.println("Área a cargo: " + areaResponsable);
    }
}
