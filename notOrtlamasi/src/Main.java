import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler
        int mat,fizik,kimya,turkce,tarih,muzik,toplam;

        //Scanner sınıfını tanımladık
        Scanner input=new Scanner(System.in);

        //kullanıcıdan veri alıyoruz.
        System.out.printf("Matematik notunuzu giriniz: ");
        mat=input.nextInt();

        System.out.printf("fizik notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.printf("kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.printf("türkçe notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.printf("tarih notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.printf("müzik notunuzu giriniz: ");
        muzik=input.nextInt();

        //sınavların toplamını aldık
        toplam=mat+fizik+kimya+turkce+tarih+muzik;

        //ortalamayı hesapladık
        double ortalama=toplam/6.0;

        //ortalama sonucunu ekrana yazdırdık.
        System.out.println("not ortalaması "+ortalama);

        //ortlamanın durumuna göre "sınıfı geçti(true)" yada "sınıfta kaldı(false)" yazdırıyoruz.
        System.out.println(ortalama>60 ? "Sınıfı geçti.":"Sınıfta kaldı.");
    }

}