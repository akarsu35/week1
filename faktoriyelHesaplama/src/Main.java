import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //c(n,r) = n! / (r! * (n-r)!)
        int n;
        int r;
        int nfak=1;  //n! demektir.
        int rfak=1;  //r! demektir.
        int nr=1;    //(n-r)! demektir.
        int cnr;     //C(n,r) demektir.

        Scanner input=new Scanner(System.in);
        System.out.println("kombinasyon değerini bulmak istediğiniz sayıyı giriniz: ");
        n= input.nextInt();

        System.out.println(n+" sayısının kaçlı kombinasyonunu bulmak istiyorsunuz: ");
        r= input.nextInt();

        while(r>n){
            System.out.println(n+" sayısına eşit yada küçük bir sayı girmelisiniz.");
            r=input.nextInt();
        }
        // n! hesaplama
        for(int i=1;i <= n;i++){
            nfak=nfak*i;
            //System.out.println(nfak);
        }

        // r! hesaplama
        for (int j=1;j <= r;j++){
            rfak=rfak*j;
            //System.out.println(rfak);
        }

        // (n-r)! hesaplama
        for (int k=1;k <= (n-r);k++){
            nr=nr*k;
            //System.out.println(nr);
        }


        //c(n,r) hesaplama
        cnr=nfak/(nr*rfak);
        System.out.println("C("+n+", "+r+")= "+cnr);
    }
}