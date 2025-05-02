public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int Fanta = 3;
    public static final int Chocolate = 4;

    private Deposito<Bebida> depositoCoca = new Deposito<>();
    private Deposito<Bebida> depositoSprite = new Deposito<>();
    private Deposito<Bebida> depositoFanta = new Deposito<>();
    private Deposito<Dulce> depositoChocolate = new Deposito<>();
    private Deposito<Moneda> depositoVuelto = new Deposito<>();
    private int precio;

    private int serie = 5;

    public Expendedor(int numProductos, int precioProductos) {
        this.precio = precioProductos;
        for (int i = 0; i < numProductos; i++) {
            depositoCoca.add(new Cocacola(serie++));
            depositoSprite.add(new Sprite(serie++));
            depositoFanta.add(new Fanta(serie++));
            depositoChocolate.add(new Chocolate(serie++));

        }
    }

    public Moneda getVuelto() {
        return depositoVuelto.get();
    }

    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null) return null;
        int valor = m.getValor();
        Deposito<Bebida> depositoB = null;
        Deposito<Dulce> depositoD = null;
        if (cual == COCA) {
            depositoB = depositoCoca;
        } else if (cual == SPRITE) {
            depositoB = depositoSprite;
        } else if (cual == Fanta) {
            depositoB = depositoFanta;
        } else if (cual == Chocolate) {
            depositoD = depositoChocolate;
        } else {
            depositoVuelto.add(m);
        }

        if (cual < 4) {
            Bebida bebida = depositoB.get();
            if (bebida == null) {
                depositoVuelto.add(m);
                return null;
            }
            if (valor < precio) {
                depositoB.add(bebida);
                depositoVuelto.add(m);
                return null;
            }
            int cambio = valor - precio;
            while (cambio <= 100) {
                depositoVuelto.add(new Moneda100());
                cambio = cambio - 100;
            }
            return bebida;

        }

        if (cual == 4) {
            Dulce dulce = depositoD.get();
            if (dulce == null) {
                depositoVuelto.add(m);
                return null;
            }
            if (valor < precio) {
                depositoD.add(dulce);
                depositoVuelto.add(m);
                return null;
            }
            int cambio = valor - precio;
            while (cambio >= 100) {
                depositoVuelto.add(new Moneda100());
                cambio = cambio - 100;
            }


            return dulce;
        }
        else return null;
    }
}


