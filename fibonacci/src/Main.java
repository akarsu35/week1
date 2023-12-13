
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,sum,a=0,b=1;// ilk iki sayıyı (0 ve 1) önceden tanımlanmalı.
        System.out.println("Fibonacci dizisinin kaç terimin yazdırmak istiyorsunuz: ");
        n=input.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;//toplam değişkene atanır.
        }

    }
}