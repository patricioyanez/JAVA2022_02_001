
public class Moto extends Vehiculo{
    private int largoManillar;

    public int getLargoManillar() {
        return largoManillar;
    }

    public void setLargoManillar(int largoManillar) {
        this.largoManillar = largoManillar;
    }

    @Override
    public String toString() {
        return "Moto{" + "largoManillar=" + largoManillar + '}';
    }
        public void mover()
    {
        System.out.println("La Moto se mueve");
    }

    @Override
    public boolean encender() {
        System.out.println("Moto enciende");
        return true;
    }
}
