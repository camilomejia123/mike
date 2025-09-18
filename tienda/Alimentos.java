public class Alimentos extends Productos {
    String fechaDeVencimiento;

    public Alimentos(String nombre, Integer precio, String fechaDeVencimiento) {
        super(nombre, precio);
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public void mostrarInformacion() {
        super.mostrarInfo();
        System.out.println("Fecha de Vencimiento: " + fechaDeVencimiento);
    }
    
}
