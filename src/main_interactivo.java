/** @author ignacio garcia  */
import java.util.Scanner;


public class main_interactivo {
    public static void main(String[] args) {

        int num=0;// Define el producto comprado
        int num2=123;// Determina si se continúa en el ciclo while
        int num3=0;// Almacena el valor de la moneda
        Moneda moneda1=null;// Objeto de tipo moneda  vacio
        Expendedor b =new Expendedor(5);// Se inicializa el expendedor con 5 productos
        System.out.println("inserte moneda:");
        Scanner o = new Scanner(System.in);
        num3 = o.nextInt();
        if (num3 == 100) {
            moneda1 = new Moneda100();
        }
        if (num3 == 500) {
            moneda1 = new Moneda500();
        }
        if (num3 == 1000) {
            moneda1 = new Moneda1000();
        }
        // Se pide la insercion de una moneda
        while(num3!=100 &&num3!=500 && num3!=1000 ) {
            System.out.println("moneda erronea, porfavor inserte moneda denuevo:");
            Scanner f = new Scanner(System.in);
            num3 = f.nextInt();
            // Se define el tipo de moneda segun el valor ingresado
            if (num3 == 100) {
                moneda1 = new Moneda100();
            }
            if (num3 == 500) {
                moneda1 = new Moneda500();
            }
            if (num3 == 1000) {
                moneda1 = new Moneda1000();
            }
        }

        // Se solicita la eleccion del producto
        System.out.println("elija producto:  ");
        System.out.println("1.cocacola");
        System.out.println("2.sprite");
        System.out.println("3.fanta");
        System.out.println("4.snickers");
        System.out.println("5.super 8");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        // Se crea un comprador con la moneda y el producto elegido
        Comprador p = new Comprador(moneda1,num,b);
        System.out.println("su vuelto es de: "+p.cuantoVuelto());
        // Bucle para continuar la compra o finalizar
        while(num2!=0) {
            System.out.println("si no desea seguir comprando elija 0 y si desea continuar elija 1");

            Scanner s2 = new Scanner(System.in);
            num2 = s2.nextInt();

            if (num2 == 0) {
                System.out.println("gracias por comprar");
            }
            // se repite la compra hasta que termina el bucle
            if (num2 == 1) {
                System.out.println("inserte moneda:");
                Scanner h = new Scanner(System.in);
                num3 = h.nextInt();
                if(num3==100){moneda1=new Moneda100();}
                if(num3==500){moneda1=new Moneda500();}
                if(num3==1000){moneda1=new Moneda1000();}
                while(num3!=100 &&num3!=500 && num3!=1000 ) {
                    System.out.println("moneda erronea, porfavor inserte moneda denuevo:");
                    Scanner k = new Scanner(System.in);
                    num3 = k.nextInt();
                    // Se define el tipo de moneda segun el valor ingresado
                    if (num3 == 100) {
                        moneda1 = new Moneda100();
                    }
                    if (num3 == 500) {
                        moneda1 = new Moneda500();
                    }
                    if (num3 == 1000) {
                        moneda1 = new Moneda1000();
                    }
                }
                System.out.println("elija producto: ");
                System.out.println("1.cocacola");
                System.out.println("2.sprite");
                System.out.println("3.fanta");
                System.out.println("4.snickers");
                System.out.println("5.super 8");
                Scanner r = new Scanner(System.in);
                num = r.nextInt();
                Comprador l = new Comprador(moneda1,num,b);
                System.out.println("su vuelto es de: "+l.cuantoVuelto());
            }


        }

    }
}
