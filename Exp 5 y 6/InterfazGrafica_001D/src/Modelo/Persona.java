package Modelo;

public class Persona {
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona() {
        this.id = 0;
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
    }
    public Persona(int id, String rut, String nombre, String apellido, String direccion) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void limpiar()
    {
        this.id = 0;
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
    }



}
