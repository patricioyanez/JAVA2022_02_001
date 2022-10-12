
public class Liquido extends Producto{
    private double grados;

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +  "\n" +
                "Grados     : " + this.grados;
    }

    @Override
    public void calcularSubtotal() {
        int resultado = 0;
        resultado = getCantidad() * getPrecio();
        setSubtotal(resultado);
    }
    
    
}
