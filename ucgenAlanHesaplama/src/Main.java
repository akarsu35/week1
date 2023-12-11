import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler ve sabitlerimiz
        double a,b,c,u,alan;
        Scanner input=new Scanner(System.in);

        //kullanıcıdan kenar uzunluklarını alıyoruz.
        System.out.println("birinci kenarı giriniz: ");
        a= input.nextDouble();

        System.out.println("ikinci kenarı giriniz: ");
        b= input.nextDouble();

        System.out.println("üçüncü kenarı giriniz: ");
        c= input.nextDouble();

        //𝑢 = (a+b+c) / 2 hesaplamma
        u=(a+b+c)/2;

        /*verilen kenar uzunlukları ile üçgen oluşur mu?
        eğer oluşmazsa alan formülü "NaN"hatası verecektir.
        bir üçgende, herhangi bir kenar diğer iki kenarın farkının mutlak değeri ile toplamı
        arasında olmalıdır.bu bütün kenarlar için sağlanmalıdır.
        Aksi halde üçgen belirtmez.
        Math.abs(a-b)  a-b sayısının mutlak değeri.
        */
        if(Math.abs((a-b))<c&&c<(a+b)&&Math.abs((a-c))<b&&b<(a+c)&&Math.abs((b-c))<a&&a<(b+c)){

            alan=Math.sqrt(u*(u-a)*(u-b)*(u-c)); //"Math.sqrt(a)" a sayısının karekökü
            System.out.println("kenar uzunlukları verilen üçgenin alanı "+alan);

        }else{
            System.out.println("kenar uzunlukları verilen üçgen oluşturulamaz.");
        }
    }
}