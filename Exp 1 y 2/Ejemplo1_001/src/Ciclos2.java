import java.util.Scanner;

public class Ciclos2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int voto = 0;
        int apruebo = 0;
        int rechazo = 0;
        while(voto != 3)
        {
            System.out.println("Realice el sufragio");
            System.out.println("1.- Apruebo");
            System.out.println("2.- Rechazo");
            System.out.println("3.- Salir");
            System.out.print("Ingrese su preferencia:");
            voto = leer.nextInt();

            if(voto < 1 || voto > 3) 
            {
                System.out.println("La opción no es válida");
            }
            else 
            {
                if(voto == 3)
                {
                    System.out.println("Cierre de la meza");
                    break;
                }
                else if(voto == 1)
                {
                    System.out.println("ud. Aprobó");
                    apruebo++; // apruebo += 1
                }
                else
                {
                    System.out.println("ud. Rechazó");
                    rechazo++;
                }
            }
        }
        
        System.out.println("Resultados de la mesa:");
        System.out.println("Apruebo: " + apruebo);
        System.out.println("Rechazo: " + rechazo);
    }
}
