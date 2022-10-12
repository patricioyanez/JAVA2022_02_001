
public class Principal {
    public static void main(String[] args) {
        // crear algunos productos a vender
        Aseo lavaLozas = new Aseo();
        lavaLozas.setCodigo(1000);
        lavaLozas.setPrecio(2500);
        lavaLozas.setDescripcion("Lava Lozas");
        lavaLozas.setTipoUso("Para lavar los platos");
        
        Liquido jager = new Liquido();
        jager.setCodigo(2000);
        jager.setPrecio(15000);
        jager.setDescripcion("Licor de Hierbas");
        jager.setGrados(35);
        
        // realizar la venta
        ListadoProductos carrito = new ListadoProductos();
        
        lavaLozas.setCantidad(2);
        lavaLozas.calcularSubtotal();
        
        jager.setCantidad(6);
        jager.calcularSubtotal();
        
        carrito.agregar(lavaLozas);
        carrito.agregar(jager);
        
        // mostrar listado de compras y total
        carrito.listar();
        
        
    }
}
