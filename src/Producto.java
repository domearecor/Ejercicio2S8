public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularCostoAdicional() {
        return 0.0;
    }

    public String mostrarInformacion() {
        return "[" + codigo + "] " + nombre + " | Precio base: $" + precio;
    }
}
