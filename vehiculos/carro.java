package vehiculos;

public class carro extends vehiculo {
    private int numeroPuertas;

    public carro(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio); // Llama al constructor de Vehiculo
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra marca, modelo y año
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
