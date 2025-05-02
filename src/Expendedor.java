public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int Fanta = 3;
    public static final int snicker = 4;
    public static final int preciosnicker=500;
    public static final int preciococa=200;
    public static final int preciosprite=200;
    public static final int preciofanta=200;


    private Deposito<Bebida> depositoCoca = new Deposito<>();
    private Deposito<Bebida> depositoSprite = new Deposito<>();
    private Deposito<Bebida> depositoFanta = new Deposito<>();
    private Deposito<Dulce> depositoChocolate = new Deposito<>();
    private Deposito<Moneda> depositoVuelto = new Deposito<>();
    private int precio;

    private int serie = 5;

    public Expendedor(int numProductos) {

        for (int i = 0; i < numProductos; i++) {
            depositoCoca.add(new Cocacola(serie++));
            depositoSprite.add(new Sprite(serie++));
            depositoFanta.add(new Fanta(serie++));
            depositoChocolate.add(new snicker(serie++));

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
        } else if (cual == snicker) {
            depositoD = depositoChocolate;
        } else {
            depositoVuelto.add(m);
        }

        if (cual < 4) {
            Bebida bebida = depositoB.get();
            if(cual == 1){precio=200;}
            if(cual == 2){precio=200;}
            if(cual == 3){precio=200;}
            if (bebida == null) {
                depositoVuelto.add(m);
                if(cual==1){System.out.println("no quedan Cocas");}
                if(cual==2){System.out.println("no quedan sprites");}
                if(cual==3){System.out.println("no quedan fantas");}
                return null;
            }
            if (valor < precio) {
                depositoB.add(bebida);
                depositoVuelto.add(m);
                System.out.println("precio excede el valor de la moneda");
                return null;
            }
            int cambio = valor - precio;
            while (cambio <= 100) {
                depositoVuelto.add(new Moneda100());
                cambio = cambio - 100;
            }
            if(cual==1){System.out.println("compro una cocacola");}
            if(cual==2){System.out.println("compro una sprite");}
            if(cual==3){System.out.println("compro una fanta");}
            return bebida;

        }

        if (cual == 4 || cual==5) {
            if(cual==4){precio=500;}
            if(cual==5){precio=300;}
            Dulce dulce = depositoD.get();
            if (dulce == null) {
                depositoVuelto.add(m);
                System.out.println("no quedan snickers");
                return null;
            }
            if (valor < precio) {
                depositoD.add(dulce);
                System.out.println();
                depositoVuelto.add(m);
                System.out.println("precio excede el valor de la moneda");
                return null;
            }
            int cambio = valor - precio;
            while (cambio >= 100) {
                depositoVuelto.add(new Moneda100());
                cambio = cambio - 100;
            }
            System.out.println("compro un snicker");

            return dulce;
        }
        else return null;
    }
}


