abstract public class Dulce extends Producto {

   public Dulce(){}


}

 class snicker extends Dulce{
     private int serie;
     public snicker(int NumSerie){this.serie=NumSerie;}

     @Override
     public int getSerie() {
         return serie;
     }
 }