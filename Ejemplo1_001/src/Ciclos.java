import java.util.Scanner;


public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor;
        int contador = 0;
        System.out.print("Ingrese un número:");
        valor = leer.nextInt();
        
        while(contador < valor)
        {
            contador++;
            System.out.println("nro:" + contador);
        }
    }
}
