import java.util.Scanner;

public class Sentencias2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int voto = 0;
        
        System.out.println("Realice el sufragio");
        System.out.println("1.- Apruebo");
        System.out.println("2.- Rechazo");
        System.out.print("Ingrese su preferencia:");
        voto = leer.nextInt();
        
        if(voto < 1 || voto > 2)
        {
            System.out.println("La opción no es válida");
        }
        else 
        {
            if(voto == 1)
            {
                System.out.println("ud. Aprobó");
            }
            else
            {
                System.out.println("ud. Rechazó");
            }

            String nombre;
            System.out.print("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.println("Gracias " + nombre + " por votar.");
        }
    }
}
