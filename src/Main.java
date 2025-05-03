public class Main {
    public static void main(String[] args) {
        Expendedor b =new Expendedor(5);
        Comprador p = new Comprador(new Moneda100(),1,b);
        Comprador x = new Comprador(new Moneda1000(),1,b);
        Comprador y = new Comprador(new Moneda1000(),2,b);
        Comprador z = new Comprador(new Moneda1000(),3,b);
        Comprador a = new Comprador(new Moneda1000(),4,b);
        Comprador d = new Comprador(new Moneda1000(),4,b);
        Comprador e = new Comprador(new Moneda1000(),4,b);
        Comprador f = new Comprador(new Moneda1000(),4,b);
        Comprador g = new Comprador(new Moneda1000(),4,b);
        Comprador h = new Comprador(new Moneda1000(),4,b);
        System.out.println(x.cuantoVuelto());











    }
}