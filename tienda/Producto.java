class Productos {
    private String nombre;
    private Integer precio;

    public Productos(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
    }
}