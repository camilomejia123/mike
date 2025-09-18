public class circulo extends figura {
    private double radio;

    public circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarInfo() {
        System.out.println("=== Información del Círculo ===");
        System.out.println("Color: " + getColor());
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
