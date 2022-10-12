import java.util.ArrayList;

public interface IOperaciones {
    // permite definir metodos que por defecto son
    // abstractos y  publicos, como también
    // constantes finales
    int grabar();
    void limpiar();
    ArrayList<Object> listar();
    
    Integer IVA = 19;
    int ILA = 13;
    Double PI = 3.14;
    
    
}
