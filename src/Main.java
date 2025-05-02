public class Main {
    public static void main(String[] args) {
        Expendedor b =new Expendedor(5,100);
        Comprador p = new Comprador(new Moneda1000(),4,b);
        Comprador a = new Comprador(new Moneda1000(),4,b);
        Comprador d = new Comprador(new Moneda1000(),4,b);
        Comprador e = new Comprador(new Moneda1000(),4,b);
        Comprador f = new Comprador(new Moneda1000(),4,b);
        Comprador j = new Comprador(new Moneda1000(),4,b);
        Comprador k = new Comprador(new Moneda1000(),4,b);

        String  l =p.getsabor();
        String s=k.getsabor();
        System.out.println(s);




    }
}