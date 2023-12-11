import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */
        double armut,elma,domates,patlican,muz,total;

        Scanner input=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        armut=input.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        elma=input.nextDouble();

        System.out.println("domates Kaç Kilo ? :");
        domates=input.nextDouble();

        System.out.println("patlıcan Kaç Kilo ? :");
        patlican=input.nextDouble();

        System.out.println("muz Kaç Kilo ? :");
        muz=input.nextDouble();

        total=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println("toplam tutar: "+total+"Tl");

    }
}