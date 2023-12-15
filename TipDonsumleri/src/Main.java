import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//kullanıcıdn veri almak için kullanıyoruz
        double num2;
        int num1;

        // Bu program, öncelikle kullanıcıdan bir tam sayı ve bir ondalıklı sayı girmesini isteriz.
        System.out.println("bir tam sayı giriniz: ");
        num1= input.nextInt();

        System.out.println("bir ondalıklı sayı giriniz: ");
        num2= input.nextDouble();

        System.out.println("girdiğiniz "+num1+" tam sayısının ondalıklı değeri: "+(double) num1);// Daha sonra bu tam sayıyı ondalıklı sayıya dönüştürerek
        System.out.println("girdiğiniz "+num2+" ondalıklı sayısının tam sayı değeri: "+(int) num2);// ve bu ondalıklı sayıyı tam sayıya dönüştürerek sonuçları ekrana yazdırdık.


    }
}