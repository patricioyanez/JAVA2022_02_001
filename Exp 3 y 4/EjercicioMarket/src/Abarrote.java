import java.sql.Date;

public class Abarrote extends Producto{
    private Date fechaVencimiento;

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\n" +
                "Fecha Vencimiento: " + fechaVencimiento;
    }
    
    @Override
    public void calcularSubtotal() {
        int resultado = 0;
        resultado = getCantidad() * getPrecio();
        setSubtotal(resultado);
    }
}
