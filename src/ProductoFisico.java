public class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String codigo, String nombre, double precio, double peso) {
        super(codigo, nombre, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularCostoAdicional() {
        return peso * 2.50;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Peso: " + peso + " kg | Adicional envío: $" + calcularCostoAdicional();
    }
}