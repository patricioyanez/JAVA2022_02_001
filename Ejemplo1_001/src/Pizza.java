
public class Pizza {
// 1.- atributos
    private String nombre;
    private String tamano;
    private String masa;
    
// 2.- constructores
    public Pizza()
    {
        this.nombre = "";
        this.tamano = "";
        this.masa   = "";
        System.out.println("Constructor sin parametro");
    }
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        System.out.println("Constructor con parametro ejecutado....");
    }
// 3.- getter and setter
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTamano() {
        return this.tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

// 4.- métodos customer o personalizado
    public void preparar()
    {
        System.out.println("Se está preparando la pizza");
    }
    
    public void cocinar()
    {
        System.out.println("Se esta cocinando la pizza");
    }
    
    public void datos()
    {
        System.out.println("*** Datos de la pizza ***");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tamaño: " + this.tamano);
        System.out.println("Masa  : " + this.masa);
    }
}
