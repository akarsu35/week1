import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max,min,n,a,b;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();


        for (int i=1;i<=n;i++){
            System.out.println(i+". sayıyı giriniz: ");
            max=input.nextInt();

        }

        /*int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;

        while (i < n) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            i++;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);*/
    }
}
