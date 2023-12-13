import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi; //kullanıcıdan istediğimiz sayı
        int i = 1; //kullanıcı tarafından girilen sayıya kadar i değişecek.
        int toplam=0; //3'e ve 4' bölünen sayıların toplamı başta 0 olacak zamanla ekleme yapacağız
        int terimSayisi=0; //kullanıcı tarafından girilen sayıya kadar olan 3 ve4 ün katlarının sayısını temsil ediyor.
        double ao = 0;//aritmetik ortalama

        //kullanıcıdan veri alıyoruz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        sayi= input.nextInt();

        while(i <= sayi) {
            if (i % 3 == 0 && i % 4 == 0) {//3 ve 4'e bölünen sayıları kullanıcının yazmış olduğu sayılara kadar sorgulama
                toplam += i;//eğer sayı 3 ve 4'e bölünüyorsa toplama ekliyoruz.
                terimSayisi++;// eğer sayı 3 ve 4'e bölünüyorsa terim sayısını 1 arttırıyoruz.
            }
            i++;

        }
        ao = toplam / terimSayisi;
        System.out.println(sayi + "'a kadar olan 3 ve 4 ün katı olan sayıların ortalaması: " + ao);

    }
}