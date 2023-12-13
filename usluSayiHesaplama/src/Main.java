
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int taban,ust;
        double sonuc=1;
        Scanner input=new Scanner(System.in);

        //tabanın girilmesini istiyoruz.
        System.out.println( "üssü alınacak sayıyı giriniz: ");
        taban=input.nextInt();

        //üssün girilmesi istiyoruz.
        System.out.println("üssü giriniz: ");
        ust=input.nextInt();

        //üs hesaplama
        if(ust<0){
            for (int i = -1; i >= ust; i--) {
                sonuc /= taban; // Tabanın tersi hesaplanıyor
            }
            System.out.println(taban+" sayısının ("+ust+"). kuvveti: "+sonuc);
        }else{
            for (int i=1;i<=ust;i++){//üs pozitif ise.
               sonuc=sonuc*taban;

            }
            System.out.println(taban+" sayısının "+ust+". kuvveti: "+sonuc);
        }

    }
}