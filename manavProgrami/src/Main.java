import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        //değişkenlerimiz
        double armut,elma,domates,patlican,muz,total;

        Scanner input=new Scanner(System.in);//Scanner sınıfı ile kullanıcıdan veri alıyoruz.

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

        //alınan verilere göre toplam fiyat hesaplama
        total=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println("toplam tutar: "+total+"Tl");

    }
}