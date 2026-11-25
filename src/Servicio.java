public class Servicio extends Producto {
    private double horas;

    public Servicio(String codigo, String nombre, double precio, double horas) {
        super(codigo, nombre, precio);
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double calcularCostoAdicional() {
        return horas * 5.0;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Duración: " + horas + " h | Adicional soporte: $" + calcularCostoAdicional();
    }
}