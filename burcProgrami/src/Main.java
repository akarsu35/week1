import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz.
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan doğum günü bilgisini alıyoruz.
        System.out.print("Doğum gününüzü giriniz: ");
        int gun = scanner.nextInt();

        //kullanıcıdan doğum yılı bilgisini alıyoruz.
        System.out.print("Doğduğunuz ayı giriniz: ");
        int ay = scanner.nextInt();

        String burc = "";//"burc" alınan bilgilere göre dolmuş olacak.

        // ay ve günlere göre burçlar.
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            burc = "Koç";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            burc = "Boğa";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            burc = "İkizler";
        }else if ((ay == 6 && gun > 22) || (ay == 7 && gun <= 22)) {
            burc = "yengeç";
        }else if ((ay == 7 && gun >=23) || (ay == 8 && gun <= 22)) {
            burc = "aslan";
        }else if ((ay == 8 && gun >=23) || (ay == 9 && gun <= 22)) {
            burc = "başak";
        }else if ((ay == 9 && gun > 22) || (ay == 10 && gun <= 22)) {
            burc = "terazi";
        }else if ((ay == 10 && gun > 22) || (ay == 11 && gun <= 21)) {
            burc = "akrep";
        }else if ((ay == 11 && gun >=22) || (ay == 12 && gun <= 21)) {
            burc = "yay";
        }else if ((ay == 12 && gun >=22) || (ay == 1 && gun <= 21)) {
            burc = "oğlak";
        }else if ((ay == 1 && gun >=22) || (ay == 2 && gun <= 19)) {
            burc = "kova";
        }else if ((ay == 2 && gun >=20) || (ay == 3 && gun <= 20)) {
            burc = "balık";
        }

        //eğer yanlış bir gün veya ay girilirse.
        if (!burc.equals("")) {
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Geçersiz doğum günü/ayı girdiniz.");
        }


    }
}
