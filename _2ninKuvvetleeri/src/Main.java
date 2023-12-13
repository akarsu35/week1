import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,i,j;

        Scanner input=new Scanner(System.in);

        //kullanıcıdan veri alıyoruz.
        System.out.println("sınır sayıyı giriniz:");
        sayi=input.nextInt();

        //kullanıcı taradından girilen sayıya kadar 4'ün kuvveti olan sayılar
        for(i=1;i<=sayi;i*=4){
            System.out.println("4'ün kuvvetleri olan sayılar: "+i);

        }
        //kullanıcı taradından girilen sayıya kadar 5'in kuvveti olan sayılar
        for (j=1;j<=sayi;j*=5){
            System.out.println("5'in kuvvetleri olan sayılar: "+j);
        }

    }
}