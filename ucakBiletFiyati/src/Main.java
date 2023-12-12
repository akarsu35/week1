
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, measure, yon;
        double normalprice, yasind,price;
        String name;

        Scanner input = new Scanner(System.in);
        //yolcu adı-soyadı
        System.out.println("adınızı - soyadınızı giriniz: ");
        name = input.nextLine();

        //yaş bilgisi
        System.out.println("merhaba " + name + " yaşınızı giriniz. ");
        age = input.nextInt();

        //mesafe bilgisi
        System.out.println("mesafe bilgisini km olarak giriniz. ");
        measure = input.nextInt();

        //yolculuk yönü
        System.out.println("yolculuk tipini seciniz lütfen\n1-tek yön\n2-gidiş dönüs");
        yon = input.nextInt();

        /*Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */

        //yaş,mesafe ve yön için uygun veri girilmezse
        if(age<=0||measure<0||(yon!=1&&yon!=2)){ //yaş,mesafe veya yön için uygun veri girilmezse
            System.out.println("Hatalı veri girdiniz.");
        }else{                                   // yaş,mesafe ve yön için uygun veri girişi
            switch (yon){
                case 1:                         //tek yön seçimi
                    if (age<12) {
                        normalprice=measure*0.1;
                        yasind=normalprice*0.5;  //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                        price=normalprice-yasind;
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");

                    }else if (age>=12&&age<24){
                        normalprice=measure*0.1;
                        yasind=normalprice*0.1;   //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                        price=normalprice-yasind;
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");
                    }else if (age>65){
                        normalprice=measure*0.1;
                        yasind=normalprice*0.3;  //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                        price=normalprice-yasind;
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");
                    }else {
                        normalprice=measure*0.1;
                        price=normalprice;
                        System.out.println("Sayın "+name+" bilet fiyatınız: "+price+" TL");
                    }
                    break;
                case 2:                                  //gidiş dönüş yön seçimi
                    if (age<12) {
                        normalprice=measure*0.1;
                        yasind=normalprice*0.5;
                        price=(normalprice-yasind)*0.8*yon; //yön indirimi uygulanınca bilet fiyatının %80 i ödenir.
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");

                    }else if (age>=12&&age<24){
                        normalprice=measure*0.1;
                        yasind=normalprice*0.1;
                        price=(normalprice-yasind)*0.8*yon;  //yön indirimi uygulanınca bilet fiyatının %80 i ödenir.
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");
                    }else if (age>65){
                        normalprice=measure*0.1;
                        yasind=normalprice*0.3;
                        price=(normalprice-yasind)*0.8*yon;  //yön indirimi uygulanınca bilet fiyatının %80 i ödenir.
                        System.out.println("Sayın "+name+" indirimli bilet fiyatınız: "+price+" TL");
                    }else {
                        normalprice=measure*0.1*0.8*yon;  //yön indirimi uygulanınca bilet fiyatının %80 i ödenir.
                        price=normalprice;
                        System.out.println("Sayın "+name+" bilet fiyatınız: "+price+" TL");
                    }
                    break;
            }

        }

    }

}