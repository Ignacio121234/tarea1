abstract public class Bebida extends Producto{
    public Bebida(){}
}

class Cocacola extends Bebida{
    private int serie;
    public Cocacola(int NumSerie){this.serie=NumSerie;}

    @Override
    public int getSerie() {
        return serie;
    }

}

class Fanta extends Bebida{
    private int serie;
    public Fanta(int NumSerie){this.serie=NumSerie;}

    @Override
    public int getSerie() {
        return serie;
    }




}



class Sprite extends Bebida{
    private int serie;
    public Sprite(int NumSerie){this.serie=NumSerie;}

    @Override
    public int getSerie() {
        return serie;
    }




}