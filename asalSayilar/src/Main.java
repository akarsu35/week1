
public class Main {
    public static void main(String[] args) {
        int bolenSayisi=0;

        for( int i=1;i<=100;i++){//1'den 100 e kadar olan sayılar için(bir sonraki açıklama doğru devam)
            for(int j=1;j<=i;j++){ //1'den sayıya kadar olan
                if(i%j==0) { //bölen bulma
                    bolenSayisi += 1;
                }
           }
           if(bolenSayisi==2){//bir sayının pozitif bölen sayısı 2 ise sayı asaldır.
              System.out.print(i+",");
           }
            /*her sayı için kendisine kadar olan sayılarda bölen bulduktan sonra
             sonraki sayı için bölen sayısını sıfırlamalıyız.
             */
           bolenSayisi=0;
        }
    }
}