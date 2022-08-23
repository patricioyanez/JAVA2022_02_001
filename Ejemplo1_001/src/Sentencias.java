
public class Sentencias {

    public static void main(String[] args) {
        System.out.println("Sentencias: iniciando...");
        
        // definir variables
        int numero = 20;
        
        int numero2;
        numero2 = 20;
        
        // if
        if(numero == numero2)
        {
            System.out.println("Los numeros son iguales");
        }
        
        numero2 = 40;
        
        if(numero == numero2)
        {
            System.out.println("Los numeros son iguales");
        }
        else
        {
            System.out.println("Los numero NO son iguales");
        }
        
        int edad = 10;
        if(edad < 14)
        {
            System.out.println("niño(a)");
        }
        else if(edad < 19)
        {
            System.out.println("Adolescente");
        }
        else if(edad < 65)
        {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("Adulto Mayor");
        }
        
    }
    
}
