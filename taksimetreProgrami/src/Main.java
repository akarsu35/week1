import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* Taksimetre KM başına 2.20 TL tutmaktadır.
        Taksimetre açılış ücreti 10 TL'dir.*/

        //değişkenlerimiz
        double distance,perKm=2.20,startPrice=10,total,min=10;

        //kullanıcıdan veri alma
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz. ");
        distance=input.nextDouble();

        //toplam tutar hesaplama
        total=(distance*perKm)+startPrice;

        total=(total<20) ? 20:total;//20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        System.out.println(distance+ "km için toplam ücret: "+total+"TL'dir.");

    }
}