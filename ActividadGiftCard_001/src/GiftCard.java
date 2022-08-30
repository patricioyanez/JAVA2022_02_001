import java.util.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date fecha;
    private Trabajador trabajo;
    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.fecha = new Date(); // null;
        this.trabajo = new Trabajador(); // null;
    } 
        
    public GiftCard(long codigo, int clave, int monto, Date fecha, Trabajador trabajo) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.fecha = fecha;
        this.trabajo = trabajo;
    }

    public Trabajador getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajador trabajo) {
        this.trabajo = trabajo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public long generarCodigo(long codigo)
    {
        return codigo = codigo +1;
    }
}
