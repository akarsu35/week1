
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,i,j;

        Scanner input=new Scanner(System.in);

        System.out.println("sınır sayıyı giriniz:");
        sayi=input.nextInt();

        for(i=1;i<=sayi;i*=4){
            System.out.println("4'ün kuvvetleri olan sayılar: "+i);

        }
        for (j=1;j<=sayi;j*=5){
            System.out.println("5'in kuvvetleri olan sayılar: "+j);
        }

    }
}