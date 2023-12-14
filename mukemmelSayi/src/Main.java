
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,bolenTopl=0;

        //kullanıcıdan sayı girmesin istiyoruz.
        System.out.println("bir sayı giriniz: ");
        number=input.nextInt();

        for(int i=1;i<number;i++){
            //girilen sayının kendisi hariç pozitif tam sayı bölenlerinin toplamını bulma
            if(number%i==0){
                bolenTopl+=i;

            }
        }

        if (bolenTopl==number){
            System.out.println(number+" sayısı mükemmel sayıdır.");
        }else {
            System.out.println(number+" sayısı mükemmel sayı değildir.");
        }

    }
}