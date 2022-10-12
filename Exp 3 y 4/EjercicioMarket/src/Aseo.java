
public class Aseo extends Producto{
    private String tipoUso;

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\n" +
                "Tipo de uso    : " + this.tipoUso;
    }
    
    @Override
    public void calcularSubtotal() {
        int resultado = 0;
        resultado = getCantidad() * getPrecio();
        setSubtotal(resultado);

    }
    
}
