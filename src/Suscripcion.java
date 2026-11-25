public class Suscripcion extends Producto {
    private int meses;

    public Suscripcion(String codigo, String nombre, double precio, int meses) {
        super(codigo, nombre, precio);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public double calcularCostoAdicional() {
        return meses * 1.50;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Duración: " + meses + " meses | Adicional gestión: $" + calcularCostoAdicional();
    }
}