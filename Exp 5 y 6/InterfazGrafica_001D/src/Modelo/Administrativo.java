
package Modelo;


public class Administrativo {
    private int rut;
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private char genero;
    private long sueldo;

    public Administrativo() {
        this.rut = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.altura = 0;
        this.genero = ' ';
        this.sueldo = 0;
    }
    
    public Administrativo(int rut, String nombre, String apellido, int edad, double altura, char genero, long sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.sueldo = sueldo;
    }
    
    
    
}
