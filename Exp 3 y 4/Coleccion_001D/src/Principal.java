
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Juan");
        nombres.add("Al");        
        System.out.println(nombres);
        
        System.out.println("valor Indice 2:" + nombres.get(2));
        nombres.set(2,"Kenita");
        System.out.println("valor Indice 2:" + nombres.get(2));
        
        // recorrer coleccion y mostrar "Nombre: "  y valor
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("El nombre es: " + nombres.get(i));
        }
        System.out.println("For each (optimizado)");
        
        for(String aux : nombres)
        {
            System.out.println("El nombre es: " + aux);
        }
        
        // eliminar un elemento
        System.out.println(nombres);
        nombres.remove(2);
        System.out.println(nombres);
        nombres.remove("Al");
        System.out.println(nombres);
        
        // busca si el elemento esta dentro de la colección
        boolean res = nombres.contains("Ana");
        
        if(res)
            System.out.println("Ana está");
        else
            System.out.println("Ana NO está");
        
        System.out.println("Cantidad de elementos: " + nombres.size());
        nombres.clear();
        System.out.println("Cantidad de elementos: " + nombres.size());
    }
}
