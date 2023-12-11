import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,c,sonuc;

        System.out.println("birinci sayıyı giriniz: ");
        a= input.nextInt();
        System.out.println("a= "+a);

        System.out.println("ikinci sayıyı giriniz: ");
        b= input.nextInt();
        System.out.println("b= "+b);

        System.out.println("üçüncü sayıyı giriniz: ");
        c= input.nextInt();
        System.out.println("c= "+c);

        sonuc=a+b*c-b;
        System.out.println(a+"+"+b+"*"+c+"-"+b+" işleminin sonucu: "+sonuc);
    }
}