import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler ve sabitlerimiz
        double fiyat,kdvOran1=0.18,kdvOran2=0.08,kdv,kdvliFiyat;

        //kullanıcıdan veri alıyoruz
        Scanner input=new Scanner(System.in);
        System.out.println("ücreti giriniz: ");
        fiyat= input.nextDouble();

        //eğer fiyat 0 ile 1000 tl arsında ise kdv oranı %18
        if (fiyat>0&&fiyat<1000){
            kdv=fiyat*kdvOran1;
            kdvliFiyat=fiyat+kdv;
            System.out.println("kdv'siz tutar "+fiyat+" TL");
            System.out.println("kdv oranı %18");
            System.out.println("kdv tutarı "+kdv+" TL");
            System.out.println("kdv'li ücret "+kdvliFiyat+" TL");

        //eğer fiyat 1000TL ve 1000TL'den büyükse kdv oranı %8
        }else if(fiyat>=1000) {
            kdv=fiyat*kdvOran2;
            kdvliFiyat=fiyat+kdv;
            System.out.println("kdv'siz tutar "+fiyat+" TL");
            System.out.println("kdv oranı %8");
            System.out.println("kdv tutarı "+kdv+" TL");
            System.out.println("kdv'li ücret "+kdvliFiyat+" TL");
        }


    }

}