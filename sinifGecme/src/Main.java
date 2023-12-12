import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float mat, fizik, kimya, turkce, muzik, ortalama,toplam=0;
        int dersSayisi=0;

        //kullanıcıdan veriler girmesini isteriz.
        Scanner input = new Scanner(System.in);
        System.out.println("matematik sınavı notunu giriniz : ");
        //girilen değeri "mat" değiskenine atama yapar.
        mat = input.nextFloat();
        if(mat>=0&&mat<=100){
            //eğer 0'dan 100'e kadar bir not aldıysa "toplam"a dahil olur ve "dersSayısı" 1arttırılır.
            dersSayisi++;
            toplam+=mat;
            System.out.println("toplam "+toplam+" ders sayısı "+dersSayisi);
        }

        System.out.println("fizik sınavı notunu giriniz : ");
        //girilen değeri "fizik" değiskenine atama yapar.
        fizik = input.nextFloat();
        if(fizik>=0&&fizik<=100){
            //eğer 0'dan 100'e kadar bir not aldıysa "toplam"a dahil olur ve "dersSayısı" 1arttırılır.
            dersSayisi++;
            toplam+=fizik;
        }

        System.out.println("kimya sınavı notunu giriniz : ");
        //girilen değeri "kimya" değiskenine atama yapar.
        kimya = input.nextFloat();
        if(kimya>=0&&kimya<=100){
            //eğer 0'dan 100'e kadar bir not aldıysa "toplam"a dahil olur ve "dersSayısı" 1arttırılır.
            dersSayisi++;
            toplam+=kimya;
        }

        System.out.println("türkçe sınavı notunu giriniz : ");
        //girilen değeri "turkce" değiskenine atama yapar.
        turkce = input. nextFloat();
        if(turkce>=0&&turkce<=100){
            //eğer 0'dan 100'e kadar bir not aldıysa "toplam"a dahil olur ve "dersSayısı" 1arttırılır.
            dersSayisi++;
            toplam+=turkce;
        }

        System.out.println("müzik sınavı notunu giriniz : ");
        //girilen değeri "muzik" değiskenine atama yapar.
        muzik = input. nextFloat();
        if(muzik>=0&&muzik<=100){
            //eğer 0'dan 100'e kadar bir not aldıysa "toplam"a dahil olur ve "dersSayısı" 1arttırılır.
            dersSayisi++;
            toplam+=muzik;
        }
        System.out.println("toplam: "+toplam+" , geçerli ders notu sayısı: "+dersSayisi);
        //ortalamayı hesaplar.
        ortalama = toplam / dersSayisi;
        System.out. println("sinav ortalamanız: " + ortalama);

        //ortalamanın 55'e esit veya 55'ten büyuk olup olmadiğını sorgular
        if(ortalama>=55){
            System.out.println("gecerli not aldınız");

        }else {
            System.out.println("gecerli bir not alamadinız.");
        }

    }
}