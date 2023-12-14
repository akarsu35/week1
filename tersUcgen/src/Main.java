
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n=input.nextInt();

        //yıldızlarla ters üçgen
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)//boşluk oluşturma
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)//yıldız oluşturma
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}