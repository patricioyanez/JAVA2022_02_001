
public class Sentencias3 {
    public static void main(String[] args) {
        // switch case
        String estadoCivil = " ";
        
        switch(estadoCivil)
        {
            case "CASADO":
                System.out.println("Ud. está casado.");
                break;
            case "SOLTERO":
                System.out.println("Ud. está soltero.");
                break;
            case "VIUDO":
                System.out.println("Ud. está viudo.");
                break;
            case "DIVORCIADO":
                System.out.println("Ud. está divorciado.");
                break;
            default:
                System.out.println("Opción no es valida.");
        }
        
    }
}
