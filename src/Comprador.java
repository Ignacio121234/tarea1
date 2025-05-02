public class Comprador  {
    private String sabor=null;
    String getsabor(){return sabor;}

    private int vuelto = 0;
    public Comprador(Moneda m,int product,Expendedor exp){
    Producto b = exp.comprarProducto(m,product);
    xdd = product;
    if (b!=null){
        sabor=QueProducto();
    }




        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            vuelto =vuelto + moneda.getValor();
        }

    }

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
     int cuantoVuelto() {
        return vuelto;
    }


}

