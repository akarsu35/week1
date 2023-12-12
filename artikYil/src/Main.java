import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);

        //kullanıcıdan veri girişi alıyoruz
        System.out.println("bir yıl giriniz: ");
        year= input.nextInt();

        //year % 4 == 0 && year % 100 != 0--->4'ün katı ancak 100'ün katı olmayan
        //year % 400 == 0--->400 'ün katı
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("girdiğiniz "+year+ " artık yıldır.");
        } else {
            System.out.println("girdiğiniz "+year+ " artık yıl değildir.");
        }
    }
}