public class Comprador  {
    private String sabor=null;//almacena el sabor del producto
    String getsabor(){return sabor;}//accede a la string sabor

    private int vuelto = 0;
    //constructor de la clase comprador
    public Comprador(Moneda m,int product,Expendedor exp){
    Producto b = exp.comprarProducto(m,product);
    xdd = product;
    //si la compra es valida se obtiene el sabor
    if (b!=null){
        sabor=QueProducto();
    }



        //se calcula el vuelto
        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            vuelto =vuelto + moneda.getValor();
        }

    }
    //variable usada para diferenciar productos
    private int xdd =0;
    String QueProducto(){
        if (xdd == 1 )
            return "coca" ;
        else if (xdd ==2)
            return "fanta";
        else if (xdd==3)
            return "sprite";
        else if (xdd==4)
            return "snicker";
        else
        return "null";
    }
    //retorna valor de vuelto
     int cuantoVuelto() {
        return vuelto;
    }


}

