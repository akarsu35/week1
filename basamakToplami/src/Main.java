
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,tempSayi,kalan,i=0,toplam=0;

        //kullanıcıdan veri almak için Scanner sınıfı kullan
        Scanner input=new Scanner(System.in);

        //kullanıcından veri alma
        System.out.println("Bir sayı giriniz: ");
        sayi=input.nextInt();
        tempSayi=sayi;


        while (tempSayi!= 0){
            kalan=tempSayi%10;  //basamakalardaki sayılari bulma
            toplam+=kalan;     //basamaklardaki sayıları "toplam=0" ekleme
            tempSayi=tempSayi/10;
            i++;
            System.out.println(i+". basamak "+kalan);
        }
        System.out.println(sayi+" sayısının rakamaları toplamı: "+toplam);
    }
}