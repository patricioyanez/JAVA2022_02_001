
public class Principal {
    // psvm + tab
    public static void main(String[] args) {
        long codigoInicial = 1000000000000000L;
        Trabajador t1 = new Trabajador(1, "K", "Ana");
        Trabajador t2 = new Trabajador();
        t2.setRut(2);
        t2.setDv("1");
        t2.setNombre("Diego");        
        
        GiftCard g1 = new GiftCard();
        codigoInicial = g1.generarCodigo(codigoInicial);
        System.out.println("" + codigoInicial);
        
        GiftCard g2 = new GiftCard();
        codigoInicial = g2.generarCodigo(codigoInicial);
        System.out.println("" + codigoInicial);
        
        System.out.println(g2);
        
        g1.setTrabajador(t1);
        System.out.println(g1.datos());
    }
}
