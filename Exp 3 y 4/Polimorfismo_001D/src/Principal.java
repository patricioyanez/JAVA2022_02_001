
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        
        Vehiculo camion = new Camion(); // Camion es subtipo
        Vehiculo moto   = new Moto();// Moto es subtipo
        // Camion c = new Vehiculo();// da error
        
        camion.mover();
        moto.mover();
        System.out.println("Herencia y colección ");
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(camion);
        vehiculos.add(moto);
        System.out.println("Listado de vehiculos");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }
    }
}
