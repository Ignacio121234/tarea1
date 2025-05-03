public class Expendedor {


   //definicion de constantes para los productos
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int Fanta = 3;
    public static final int snicker = 4;
    public static final int super8 = 5;

    //definicion de los precios de los productos
    public static final int preciosnicker=500;
    public static final int preciosuper8=300;
    public static final int preciococa=200;
    public static final int preciosprite=200;
    public static final int preciofanta=200;

    //creacion de los depositos de productos y monedas
    private Deposito<Bebida> depositoCoca = new Deposito<>();
    private Deposito<Bebida> depositoSprite = new Deposito<>();
    private Deposito<Bebida> depositoFanta = new Deposito<>();
    private Deposito<Dulce> depositosnicker = new Deposito<>();
    private Deposito<Dulce> depositosuper8 = new Deposito<>();
    private Deposito<Moneda> depositoVuelto = new Deposito<>();
    private int precio;

    private int serie = 5;



    /**
     * Constructor de Expendedor.
     * Crea un numero determinado de productos y los agrega a los depositos
     *
     * @param numProductos Numero de productos iniciales en cada deposito
     */
    public Expendedor(int numProductos) {

        for (int i = 0; i < numProductos; i++) {
            depositoCoca.add(new Cocacola(serie++));
            depositoSprite.add(new Sprite(serie++));
            depositoFanta.add(new Fanta(serie++));
            depositosnicker.add(new snicker(serie++));
            depositosuper8.add(new super8(serie++));

        }
    }
    //metodo que saca una moneda del deposito de monedas
    public Moneda getVuelto() {
        return depositoVuelto.get();
    }

    //Se utiliza para comprar productos
    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null) return null;
        int valor = m.getValor();
        Deposito<Bebida> depositoB = null;
        Deposito<Dulce> depositoD = null;

        //se define el deposito a utilizar
        if (cual == COCA) {
            depositoB = depositoCoca;
        } else if (cual == SPRITE) {
            depositoB = depositoSprite;
        } else if (cual == Fanta) {
            depositoB = depositoFanta;
        } else if (cual == snicker) {
            depositoD = depositosnicker;
        } else {
            depositoVuelto.add(m);
        }


        //dependiendo de el producto el codigo se separa en 2 ramas


        //Rama codigo para bebidas
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


        // Rama codigo para dulces
        if (cual == 4 || cual==5) {

            //se define el precio dependiedo el producto
            if(cual==4){precio=500;}
            if(cual==5){precio=300;}
            Dulce dulce = depositoD.get();

            //condicion para verficar si quedan snickers
            if (dulce == null) {
                depositoVuelto.add(m);
                System.out.println("no quedan snickers");
                return null;
            }
            //condificion para vereficar valor de la moneda
            if (valor < precio) {
                depositoD.add(dulce);
                System.out.println();
                depositoVuelto.add(m);
                System.out.println("precio excede el valor de la moneda");
                return null;
            }

            //creacion de vuelto
            int cambio = valor - precio;
            while (cambio >= 100) {
                depositoVuelto.add(new Moneda100());
                cambio = cambio - 100;
            }
            if(cual==4){ System.out.println("compro un snicker");}
            if(cual==5){ System.out.println("compro un super 8");}

            return dulce;
        }
        else return null;
    }
}


