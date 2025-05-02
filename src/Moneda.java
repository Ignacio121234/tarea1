abstract class Moneda {
    private int serie;


    public Moneda() {
    }




    public abstract int getValor();
}

class Moneda100 extends Moneda{

    public int getValor() {
        return 100;
    }


}

class Moneda500 extends Moneda{


    public int getValor() {
        return 500;
    }

}
class Moneda1000 extends Moneda{

    public int getValor() {
        return 1000;
    }


}