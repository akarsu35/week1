
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, surname;
        int year, kalan;


        Scanner input = new Scanner(System.in);
        //kullanıcıdan adı ve soyadı bilgisi alıyoruz.
        System.out.println("adınız: ");
        name = input.nextLine();

        System.out.println("soyadınız: ");
        surname = input.nextLine();

        // kullanıcıdan doğum yılı bilgisini alıyoruz.
        System.out.println("merhaba sayın " + name + " " + surname + " hosgeldiniz. \nDoğum yılınızı giriniz: ");
        year = input.nextInt();

        //doğum tarihinin 12 ye bölümünden kalanı buluyoruz.
        kalan = year % 12;

        //kalana göre çin zodyağı burcunu yazıyoruz.
        switch (kalan){
            case 1:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'horoz' ");
                break;
            case 2:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'köpek'");
                break;
            case 3:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'domuz'");
                break;
            case 4:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'fare'");
                break;
            case 5:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'öküz'");
                break;
            case 6:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'kaplan'");
                break;
            case 7:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'tavsan'");
                break;
            case 8:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'ejderha'");
                break;
            case 9:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'yılan'");
                break;
            case 10:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'at'");
                break;
            case 11:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'koyun'");
                break;
            case 0:
                System.out.println("sayın "+name+" "+surname+" çin zodyağı burcunuz 'maymun'");
                break;
            default:
                System.out.println("uygun bir doğum tarihi giriniz.");
        }

    }
}