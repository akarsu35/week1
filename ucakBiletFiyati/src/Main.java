
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, measure, yon;
        double normalprice, yasind, ind, price;
        String name;

        Scanner input = new Scanner(System.in);
        //yolcu adı-soyadı
        System.out.println("adınızı - soyadınızı giriniz: ");
        name = input.nextLine();

        //yaş bilgisi
        System.out.println("merhaba " + name + " yasınızı giriniz. ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("yaş bilgisi pozitif bir sayı olmalıdır.\nYaşınızı tekrar giriniz: ");
            age = input.nextInt();
        } else {
            System.out.println("yaş bilgisi için teşekkürler.");
        }
        //mesafe bilgisi
        System.out.println("mesafe bilgisini km olarak giriniz. ");
        measure = input.nextInt();
        if (measure <= 0) {
            System.out.println("mesafe bilgisi pozitif bir sayı olmalıdır. \nmesafeyi tekrar giriniz: ");
            measure = input.nextInt();
        } else {
            System.out.println("mesafe bilgisi için teşekkürler.");
        }
        //yolculuk yönü
        System.out.println("yolculuk tipini seciniz lütfen\n1-tek yön\n2-gidiş dönüs");
        yon = input.nextInt();
        if (yon!=1&&yon!=2){
            System.out.println("yön olarak 1 yada 2 girebilirsiniz\nLütfen yönü tekrar seçiniz:");
            yon = input.nextInt();
        } else {
            System.out.println("yön bilgisi için teşekkürler.");
        }

        /*Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */
        switch (yon){
            case 1:
                if (age<12) {
                    normalprice=measure*0.1;
                    yasind=normalprice*0.5;
                    price=normalprice-yasind;
                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);

                }else if (age>=12&&age<24){
                    normalprice=measure*0.1;
                    yasind=normalprice*0.1;
                    price=normalprice-yasind;
                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);
                }else if (age>65){
                    normalprice=measure*0.1;
                    yasind=normalprice*0.3;
                    price=normalprice-yasind;
                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);
                }else {
                    normalprice=measure*0.1;

                    price=normalprice;
                    System.out.println("Sayın "+name+" bilet fiyatınız: "+price);
                }
                break;
            case 2:
                if (age<12) {
                    normalprice=measure*0.1;
                    yasind=normalprice*0.5;
                    price=(normalprice-yasind)*0.8*yon;


                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);

                }else if (age>=12&&age<24){
                    normalprice=measure*0.1;
                    yasind=normalprice*0.1;
                    price=(normalprice-yasind)*0.8*yon;
                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);
                }else if (age>65){
                    normalprice=measure*0.1;
                    yasind=normalprice*0.3;
                    price=(normalprice-yasind)*0.8*yon;
                    System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price);
                }else {
                    normalprice=measure*0.1*0.8*yon;

                    price=normalprice;
                    System.out.println("Sayın "+name+" bilet fiyatınız: "+price);
                }
                break;

        }

    }

}