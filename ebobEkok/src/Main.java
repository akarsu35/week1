
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 1,num1,ebob=1,num2,ekok;
        /*herhangi iki sayı için 1 kesinlikle ortak bölendir
        dolayısıyla ebob=1 alıyoruz.sonra değişecek.
         */

        Scanner input=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz: ");
        num1= input.nextInt();

        System.out.println("ikinci sayıyı giriniz: ");
        num2= input.nextInt();

        /*küçük sayıya kadar olan ortak bölenlere bakmamız yeterlidir.
       çünkü küçük sayıdan büyük olanlar büyük sayıyı bölerken
       küçük sayıyı bölmeyecektir.*/
        while(i<=Math.min(num1,num2)){
            if(num1%i==0&&num2%i==0){
                ebob=i;//ebob=1 almıştık.şimdi değiştiriyoruz.

            }
            i++;
        }
        /*iki sayının çarpımı bu sayıların ebob ile ekok'unun çarpımına eşittir.
        dolayısıyla sayıların çarpımını ebob'a bölersek ekok bulunur.
         */
        ekok=num1*num2/ebob;
        System.out.println("ebob("+num1+","+num2+"): "+ebob);
        System.out.println("ekok("+num1+","+num2+"): "+ekok);

    }
}