
public class AlumnoGratuidad extends Alumno{
    private boolean activo;

    public AlumnoGratuidad(boolean activo, int nro) {
        super(nro);
        this.activo = activo;
    }
    
    public AlumnoGratuidad() {
        super(10);
        System.out.println("Soy alumno con gratuidad");
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String datos() {
        return super.datos()+
               "\nActivo      : " + (activo?"Si":"No"); 
    }
    
    
}
