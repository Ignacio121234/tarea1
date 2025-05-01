abstract class Moneda {
    private int serie;


    public Moneda() {
        this.serie = (int) (Math.random() * 100000); // numero de serie aleatorio
    }

    public int getSerie() {
        return serie;

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