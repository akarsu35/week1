
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


        while(i<=num1){
             /*herhangibir sayıya kadar olan ortak bölenlere bakmamız yeterlidir.
       eğer sayı küçük ise sayıdan büyük olanlar büyük sayıyı bölerken
       küçük sayıyı bölmeyecektir.
       eğer sayı büyükse küçük sayıya kadar olanlardan ortak bölen olur.
       yani burada num1 yerine num2 de yazsak aynı sonucu alırız.*/
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