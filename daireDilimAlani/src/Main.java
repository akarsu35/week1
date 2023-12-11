import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        double r,pi=3.14,alan,angle,dilim;
        Scanner input=new Scanner(System.in);

        System.out.println("yarıçap uzunluğunu giriniz: ");
        r=input.nextDouble();

        System.out.println("daire diliminin merkez açısını giriniz: ");
        angle=input.nextDouble();

        alan=pi*r*r;

        dilim=alan*angle/360;
        System.out.println("yarı çapı "+r+" olan "+angle+" derecelik daire diliminin alanı "+dilim);

    }
}



