
import java.util.ArrayList;


public class ListadoProductos {
    private ArrayList<Producto> listado;

    public ListadoProductos() {
        listado = new ArrayList<Producto>();
    }
    public boolean agregar(Producto producto)
    {
        return listado.add(producto);
    }
    public void listar()
    {
        int totalCompra = 0;
        System.out.println("========= LISTADO DE COMPRA =========");
        for (Producto producto : listado) {
            System.out.println(producto.imprimir());
            totalCompra += producto.getSubtotal();
        }
        System.out.println("======================================");
        System.out.println("El total de compra es: " + totalCompra);
    }
    public boolean eliminar(int codigo)
    {
        for (Producto producto : listado) {
            if(producto.getCodigo() == codigo)
            {
                listado.remove(producto);
                return true;
            }
        }
        return false;
    }
}
