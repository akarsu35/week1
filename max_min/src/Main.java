import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,number,max,min;
        boolean first=true;
        Scanner input = new Scanner(System.in);//kullanıcıdan veri almak için kullanıyoruz.

        System.out.print("Kaç Tane Sayı Gireceksiniz ? : ");
        n=input.nextInt();
        max=0;//maximum sayıyı 0 yapıyoruz başlangıçta,girilen sayılarla karşılaştırıp yeni değer atayacağız.
        min=0;//minimum sayıyı 0 yapıyoruz başlangıçta,girilen sayılarla karşılaştırıp yeni değer atayacağız.

        for (int i =1;i <=n;i++){
            System.out.print(i+".Sayıyı Giriniz : ");
            number=input.nextInt();

            if (first){//i=1 olduğu için tek sayı var ve bu tek sayı(aşağıya doğru oku)

                max=number;//hem max değer
                min=number;//hem de min değerdir.
                first=false;//artık 2.,3...,ve diğer sayıları gireceğimiz için bu döngüden çıkmak gerekir,
                            // başlangıçta "true" olan "first" değişkenini "false" yapıyoruz ki bu kod bloğuna girmesin.
            }
            if (number>max){//girilen 2.(i=2)sayı birinci sayıdan büyükse max artık 2. sayıdır
                max=number;

            }else if (number < min){//girilen 2. sayı birinci sayıdan küçükse min artık 2. sayıdır.
                min=number;         // daha sonra 3.(i=3) sayıyı 2. sayı ile kıyaslar.
                                    // daha sonra 4.(i=4) sayıyı 2. sayı ile kıyaslar. bu döngü bu şekilde devam eder.
            }


        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);

    }
}