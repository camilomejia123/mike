public class Perro extends Animales {
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("su raza es  " + raza);
    }
}
