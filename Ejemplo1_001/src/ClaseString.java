import java.util.Scanner;
public class ClaseString {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.print("Ingrese Nombre:");
        nombre = leer.next();
        System.out.println("valor :" + nombre);
        System.out.println("length:" + nombre.length());
        System.out.println("chatAt:" + nombre.charAt(2));
        String rut = "75003001";
        int largo = rut.length();
        System.out.println("DV:" + rut.charAt(largo-1));
        
        String nombre2 = "pedro";
        String nombre3 = "PEDRO";
        
        if(nombre2.equals(nombre3))
            System.out.println("Nombres son iguales");
        else
            System.out.println("No son iguales");
        
        if(nombre2.equalsIgnoreCase(nombre3))
            System.out.println("Ignore: Nombres son iguales");
        else
            System.out.println("Ignore: No son iguales");
        
        
        String texto = "Hola, ¿Como estan?";
        
        System.out.println("start: " + texto.startsWith("Hola")); 
        System.out.println("start: " + texto.startsWith("Chao"));
        System.out.println("ends: " + texto.endsWith("estan?")); 
        System.out.println("ends: " + texto.endsWith("vio"));
        
        String auxiliar =""+ texto.toUpperCase().startsWith("HOLA");
        System.out.println("Resultado: " + auxiliar);
        System.out.println("Resultado: " + texto);
        
        String valor2 = "    hola     ";
        System.out.println("__" + valor2 + "__");
        System.out.println("__" + valor2.trim() + "__");
        
        String valor3 = "Bandera";
        String resultado = valor3.substring(2);
        System.out.println("substring: " + resultado);
        resultado = valor3.substring(1,5);
        System.out.println("substring: " + resultado);
        rut = "10700-k";
        System.out.println("rut:" + rut.substring(0, 5));
        
    }
}
