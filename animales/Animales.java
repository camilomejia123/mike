public class Animales {
    private String nombre;
    private int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInfo() {
        System.out.println("El nombre es " + getNombre() + ", tiene " + getEdad() + " años.");
    }
}