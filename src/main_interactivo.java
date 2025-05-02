import java.util.Scanner;

public class main_interactivo {
    public static void main(String[] args) {

        int num=0;
        String num1;
        int num2=123;
        int num3=0;
        Moneda moneda1=null;
        Expendedor b =new Expendedor(5);
        System.out.println("inserte moneda:");
        Scanner f = new Scanner(System.in);
        num3 = f.nextInt();
        if(num3==100){moneda1=new Moneda100();}
        if(num3==500){moneda1=new Moneda500();}
        if(num3==1000){moneda1=new Moneda1000();}
        System.out.println("elija producto:  ");
        System.out.println("1.cocacola");
        System.out.println("2.sprite");
        System.out.println("3.fanta");
        System.out.println("4.snickers");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        Comprador p = new Comprador(moneda1,num,b);

        while(num2!=0) {
            System.out.println("si no desea seguir comprando elija 0 y si desea continuar elija 1");

            Scanner s2 = new Scanner(System.in);
            num2 = s2.nextInt();

            if (num2 == 0) {
                System.out.println("gracias por comprar");
            }
            if (num2 == 1) {
                System.out.println("inserte moneda:");
                Scanner h = new Scanner(System.in);
                num3 = h.nextInt();
                if(num3==100){moneda1=new Moneda100();}
                if(num3==500){moneda1=new Moneda500();}
                if(num3==1000){moneda1=new Moneda1000();}
                System.out.println("elija producto: ");
                System.out.println("1.cocacola");
                System.out.println("2.sprite");
                System.out.println("3.fanta");
                System.out.println("4.snickers");
                Scanner r = new Scanner(System.in);
                num = r.nextInt();
                Comprador l = new Comprador(moneda1,num,b);
            }


        }

    }
}
