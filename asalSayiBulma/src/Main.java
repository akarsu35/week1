import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int firstn,secn,bolenSayisi=0;
        Scanner input=new Scanner(System.in);
        System.out.println("küçük sayı:");
        firstn=input.nextInt();

        System.out.println("büyük sayı: ");
        secn=input.nextInt();

        for( int i=firstn;i<=secn;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0) {
                    bolenSayisi += 1;
                }
            }
            if(bolenSayisi==2){
                System.out.print(i+",");
            }
            bolenSayisi=0;
        }
    }
}