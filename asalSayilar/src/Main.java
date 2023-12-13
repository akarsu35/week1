
public class Main {
    public static void main(String[] args) {
        int bolenSayisi=0;

        for( int i=1;i<=100;i++){
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