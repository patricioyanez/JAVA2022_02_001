
public class Camion extends Vehiculo{
    private boolean tieneAcople;

    public boolean isTieneAcople() {
        return tieneAcople;
    }

    public void setTieneAcople(boolean tieneAcople) {
        this.tieneAcople = tieneAcople;
    }

    @Override
    public String toString() {
        return "Camion{" + "tieneAcople=" + tieneAcople + '}';
    }
    public void mover()
    {
        System.out.println("El Camión se mueve");
    }
}
