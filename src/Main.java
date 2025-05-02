public class Main {
    public static void main(String[] args) {
        Expendedor b =new Expendedor(5,500);
        Comprador p = new Comprador(new Moneda1000(),5,b);

        System.out.println(p.QueProducto());
    }
}