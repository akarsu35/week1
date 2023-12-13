
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//scanner sınıfını tanımlıyoruz.

        int sayi;//harmonik sayı değişkeni
        double toplam=0;//harmonik sayı dizi toplamı.
        System.out.println("bir sayı giriniz: ");
        sayi=input.nextInt();

        //girilen sayıya göre harmonik dizi toplam değeri
        //1+(1/2)+(1/3)+...+(1/sayi)=toplam
        for(int i=1;i<=sayi;i++){
            toplam+=(1.0/i);
        }
        System.out.println("girilen harmonik sayı dizisinin değeri: "+toplam);
    }
}