
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int cilindrada;
    private String tipoCombustible;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + '}';
    }
    
    public void mover()
    {
        System.out.println("El Vehiculo se mueve");
    }
    
    public abstract boolean encender();
}
