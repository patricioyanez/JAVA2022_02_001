
package Modelo;

public class Automovil {
    private int id; // nuevo att
    private String patente;
    private double cilindrada;
    private int puertas;
    private String marca;
    private String modelo;
    private boolean tieneEncendidoElectronico;
    private String tipoCombustible;
    
    public Automovil() {
        this.id = 0;
        this.patente = "";
        this.cilindrada = 0;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.tipoCombustible = "";
        this.tieneEncendidoElectronico = false;
    }
    public Automovil(int id,String patente, double cilindrada, int puertas, String marca, String modelo, boolean tieneEncendidoElectronico, String tipoCombustible) {
        this.id = id;
        this.patente = patente;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.tieneEncendidoElectronico = tieneEncendidoElectronico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean isTieneEncendidoElectronico() {
        return tieneEncendidoElectronico;
    }

    public void setTieneEncendidoElectronico(boolean tieneEncendidoElectronico) {
        this.tieneEncendidoElectronico = tieneEncendidoElectronico;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

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

    public String getLitrosMaletero() {
        return tipoCombustible;
    }

    public void setLitrosMaletero(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    public String obtenerDatos() {
        return "Automovil{" + "patente=" + patente + ", cilindrada=" + cilindrada + ", puertas=" + puertas + ", marca=" + marca + ", modelo=" + modelo + ", tipo Combustible=" + tipoCombustible + ", tieneEncendidoElectronico=" + tieneEncendidoElectronico + '}';
    }
    
    public void limpiar()
    {
        this.id = 0;
        this.patente = "";
        this.cilindrada = 0;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.tipoCombustible = "";
        this.tieneEncendidoElectronico = false;
    }

    
}
