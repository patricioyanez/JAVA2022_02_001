
package Modelo;

public class Automovil {
    private String patente;
    private double cilindrada;
    private int puertas;
    private String marca;
    private String modelo;
    private double litrosMaletero;
    private boolean tieneEncendidoElectronico;
    
    public Automovil() {
        this.patente = "";
        this.cilindrada = 0;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.tieneEncendidoElectronico = false;
    }
    public Automovil(String patente, double cilindrada, int puertas, String marca, String modelo, double litrosMaletero, boolean tieneEncendidoElectronico) {
        this.patente = patente;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.marca = marca;
        this.modelo = modelo;
        this.litrosMaletero = litrosMaletero;
        this.tieneEncendidoElectronico = tieneEncendidoElectronico;
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

    public double getLitrosMaletero() {
        return litrosMaletero;
    }

    public void setLitrosMaletero(double litrosMaletero) {
        this.litrosMaletero = litrosMaletero;
    }


    public String obtenerDatos() {
        return "Automovil{" + "patente=" + patente + ", cilindrada=" + cilindrada + ", puertas=" + puertas + ", marca=" + marca + ", modelo=" + modelo + ", litrosMaletero=" + litrosMaletero + ", tieneEncendidoElectronico=" + tieneEncendidoElectronico + '}';
    }
    
    public void limpiar()
    {
        this.patente = "";
        this.cilindrada = 0;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.tieneEncendidoElectronico = false;
    }
    
}
