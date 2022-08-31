
public class Principal {
    // psvm + tab
    public static void main(String[] args) {
        long codigoInicial = 1000000000000000L;
        GiftCard g1 = new GiftCard();
        codigoInicial = g1.generarCodigo(codigoInicial);
        System.out.println("" + codigoInicial);
        
        GiftCard g2 = new GiftCard();
        codigoInicial = g2.generarCodigo(codigoInicial);
        System.out.println("" + codigoInicial);
        
        System.out.println(g2);
    }
}
