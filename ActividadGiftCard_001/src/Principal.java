
public class Principal {
    // psvm + tab
    public static void main(String[] args) {
        long codigoInicial = 1000000000000000L;
        Trabajador t1 = new Trabajador(10200300, "K", "Ana");
        Trabajador t2 = new Trabajador();
        t2.setRut(20300400);
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
        g1.generarClave();
        g1.setMonto(100000);
        System.out.println(g1.datos());
        g2.setTrabajador(t2);
        g2.generarClave();
        g2.setMonto(150000);
        System.out.println(g2.datos());
        
        System.out.println("Alcanza? g1:" + (g1.validarSaldo(10000)?"si":"no"));
        System.out.println("Alcanza? g2:" + (g2.validarSaldo(5000000)?"Si":"NO"));
        
    }
}
