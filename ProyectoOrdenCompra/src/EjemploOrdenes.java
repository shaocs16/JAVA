import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("order1");
        orden1.setCliente(new Cliente("Bruno", "Perez"));
        orden1.setFecha(new Date());
        orden1.addProductos(new Producto("Nvidia", "RTX 5070", 3500));
        orden1.addProductos(new Producto("MSI", "RTX 5080", 3800));
        orden1.addProductos(new Producto("Gigabyte", "RTX 5090", 4560));
        orden1.addProductos(new Producto("Asus", "RTX 4070", 2750));

        OrdenCompra orden2 = new OrdenCompra("order2");
        orden2.setCliente(new Cliente("Maria", "Diaz"));
        orden2.setFecha(new Date());
        orden2.addProductos(new Producto("Samsung", "S26", 1300));
        orden2.addProductos(new Producto("Galzy", "S25", 1100));
        orden2.addProductos(new Producto("Enterptise", "S24", 950));
        orden2.addProductos(new Producto("Nucl", "S23", 740));

        OrdenCompra orden3 = new OrdenCompra("order3");
        orden3.setCliente(new Cliente("Estevan", "Ocon"));
        orden3.setFecha(new Date());
        orden3.addProductos(new Producto("Apple", "MacBook Air", 2278));
        orden3.addProductos(new Producto("Abc", "MacBook Pro", 3604));
        orden3.addProductos(new Producto("BCA", "MacBook Neo", 700));
        orden3.addProductos(new Producto("OLI", "Mac Mini", 599));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Orden: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente().toString());
            System.out.println("Ha comprado el dia: " + orden.getFecha().toString());
            System.out.println("Los productos que ha comprado son: ");
            for (Producto producto : orden.getProductos()) {
                System.out.println("Fabricante: " + producto.getFabricante() + ", Nombre item: " + producto.getNombre() + ", Precios: "
                + producto.getPrecio() + "€");
            }
            System.out.println("Total de la compra: " + orden.granTotal() + "€");
            System.out.println("============================================================================");
        }


    }

}
