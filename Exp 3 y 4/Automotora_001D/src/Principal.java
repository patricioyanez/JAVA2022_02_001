
public class Principal {
    public static void main(String[] args) {
        Puesto supervisor = new Puesto(100, "Supervisor");
        Puesto cajero = new Puesto(200, "Cajero");
        
        Empleado e1 = new Empleado("1-9", "Juan", "M", 1, 25, cajero);
        Empleado e2 = new Empleado("2-7", "Ana", "F", 2, 22, cajero);
        Empleado e3 = new Empleado("3-5", "Luis", "M", 5, 50, supervisor);
        
        Empresa mall = new Empresa();
        
        mall.agregar(e1);
        mall.agregar(e2);
        mall.agregar(e3);
        
        mall.listar();
        
        if (mall.buscar("1-9")) {
            System.out.println("Empleado registrado");
        } else {
            System.out.println("Empleado NO registrado");
        }
        if (mall.buscar("5-1")) {
            System.out.println("Empleado registrado");
        } else {
            System.out.println("Empleado NO registrado");
        }
        
        mall.eliminar("1-9");
        mall.eliminar("2-7");
        mall.listar();
    }
}
