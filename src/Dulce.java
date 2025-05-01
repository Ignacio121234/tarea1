abstract public class Dulce extends Producto {

   public Dulce(){}


}

 class Chocolate extends Dulce{
     private int serie;
     public Chocolate(int NumSerie){this.serie=NumSerie;}

     @Override
     public int getSerie() {
         return serie;
     }
 }