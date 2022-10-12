
public abstract class Producto {
    private int codigo;
    private String descripcion;
    private int precio;
    private int cantidad;
    private int subtotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
   
    public String imprimir() {
        return "Código      : " + codigo + "\n" +
               "Descripción : " + descripcion + "\n" +
               "Precio      : " + precio + "\n" +
               "Cantidad    : " + cantidad + "\n" +
               "Subtotal    : " + subtotal;
    }

    public abstract void calcularSubtotal();
}
