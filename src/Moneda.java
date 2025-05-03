abstract class Moneda {
    private int serie;// Numero de serie del producto

    //Constructor de la clase Moneda
    public Moneda() {
    }



    //metodo abstracto para obtener valor de moneda
    public abstract int getValor();
}

//implementacion de monedas de 100
class Moneda100 extends Moneda{

    //metodo que retorna el valor de la moneda
    public int getValor() {
        return 100;
    }


}
//implementacion de monedas de 500
class Moneda500 extends Moneda{

    //metodo que retorna el valor de la moneda
    public int getValor() {
        return 500;
    }

}
//implementacion de monedas de 1000
class Moneda1000 extends Moneda{


    //metodo que retorna el valor de la moneda
    public int getValor() {
        return 1000;
    }


}