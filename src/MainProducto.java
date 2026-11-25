import java.util.ArrayList;

public class MainProducto {
    public static void main(String[] args) {
        Producto pf1 = new ProductoFisico("PF01", "Lámpara de escritorio", 45.0, 1.8);
        Producto pf2 = new ProductoFisico("PF02", "Silla ergonómica", 180.0, 12.0);

        Producto pd1 = new ProductoDigital("PD01", "Plantilla Notion Pro", 19.0, 150.0);
        Producto pd2 = new ProductoDigital("PD02", "Curso Edición Video", 59.0, 2400.0);

        Producto sv1 = new Servicio("SV01", "Auditoría SEO", 120.0, 4.0);
        Producto sv2 = new Servicio("SV02", "Configuración Tienda", 90.0, 3.0);

        Producto sub1 = new Suscripcion("SUB01", "Plan Analítica Mensual", 29.0, 6);

        ArrayList<Producto> catalogo = new ArrayList<>();
        catalogo.add(pf1);
        catalogo.add(pf2);
        catalogo.add(pd1);
        catalogo.add(pd2);
        catalogo.add(sv1);
        catalogo.add(sv2);
        catalogo.add(sub1);

        System.out.println("=== PRUEBAS MÍNIMAS ND-H1 ===");
        for (Producto p : catalogo) {
            System.out.println(p.mostrarInformacion() + " | Total: $" + (p.getPrecio() + p.calcularCostoAdicional()));
        }
    }
}