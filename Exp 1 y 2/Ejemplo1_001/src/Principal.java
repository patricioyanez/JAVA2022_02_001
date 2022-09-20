// comentario de una linea

/*
comentario para 
más de una linea
*/
public class Principal {
    
    // el main es el punto de arranque de la app
    public static void main(String[] args)
    {
        // escribir codigo java
        System.out.println("Hola Mundo!!!");        
        // sout + tab
        
        // crear un objeto pizza
        Pizza pizza1 = new Pizza("Texana", "Familiar", "Tradicional");
        
        Pizza pizza2;
        pizza2 = new Pizza();
        
        
        pizza1.cocinar();
        pizza2.cocinar();
        
        
        System.out.println(pizza1.getNombre());
        pizza1.setNombre("Super Texana");
        System.out.println(pizza1.getNombre());
        
        pizza2.setNombre("Napolitana");
        pizza1.datos();
        pizza2.datos();

        
    }    
}
