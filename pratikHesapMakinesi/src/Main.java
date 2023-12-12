import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double n1,n2;//arasında işlem yapılacak sayılar.
        int n2select, select;//switch-case yapısı için seçimler.

        Scanner input=new Scanner(System.in);//kullanıcıdan veri almak için Scanner sınıfını kullan

        System.out.println("birinci sayıyı giriniz: ");//birinci sayıyı istiyoruz.
        n1=input.nextDouble();

        System.out.println("ikinci sayıyı giriniz: ");//ikinci sayıyı istiyoruz.
        n2=input.nextDouble();
        n2select= (int) n2;//bölme işlemini switch-case yapısı ile yazarken kullanılacak.

        // sayılar arasında yapılacak işlemler
        System.out.println("işleminizi seçiniz: \n1)toplama\n2)çıkarma\n3)çarpma\n4)bölme");
        select=input.nextInt();

        //işlem tanımlama
        switch (select) {
            case 1:
                System.out.println("toplam: " + (n1 + n2));
                break;

            case 2:
                System.out.println("cıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpım: " + (n1 * n2));
                break;
            case 4:
               /* if (n2 == 0) {
                    System.out.println("sayılar  0'a bölünemez. ");
                } else {
                    System.out.println("bölüm: " +(n1 / n2));
                }  bölme işleminin if-else ile yapılması.*/
                //bölme işlemini switch-case yapısı ile yazmak.
                switch (n2select){
                    case 0:
                        System.out.println("sayılar  0'a bölünemez.");//hata---sayılar 0'bölünemez
                        break;
                    default:
                        System.out.println("bölüm: " +  (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("yanlış bir işlem girdiniz.Yeniden deneyiniz.");
                break;
        }
    }
}