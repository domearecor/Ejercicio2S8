public class ProductoDigital extends Producto {
    private double tamanoMB;

    public ProductoDigital(String codigo, String nombre, double precio, double tamanoMB) {
        super(codigo, nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    @Override
    public double calcularCostoAdicional() {
        return tamanoMB * 0.01;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Tamaño: " + tamanoMB + " MB | Adicional hosting/descarga: $" + calcularCostoAdicional();
    }
}