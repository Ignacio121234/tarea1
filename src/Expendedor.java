public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int Fanta = 3;
    public static final int Chocolate = 4;

    private Deposito<Bebida> depositoCoca = new Deposito<>();
    private Deposito<Bebida> depositoSprite = new Deposito<>();
    private Deposito<Bebida> depositoFanta = new Deposito<>();
    private Deposito<Bebida> depositoChocolate = new Deposito<>();
    private Deposito<Moneda> depositoVuelto = new Deposito<>();
    private int precio;

    private int serie = 1000;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precio = precioBebidas;
        for (int i = 0; i < numBebidas; i++) {
            depositoCoca.add(new Cocacola(serie++));
            depositoSprite.add(new Sprite(serie++));
        }
    }
}