
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int balance=1500;//başlangıçtaki para
        int right=3;//deneme hakkı
        int price;//yatırılan para
        int select;//banka işlemi
        String password,userName;
        while(right>0){
            System.out.println("Kullanıcı adını giriniz: ");//kullanıcıdan bilgi alıyoruz
            userName=input.nextLine();

            System.out.println("şifrenizi giriniz: ");//kullanıcıdan bilgi alıyoruz
            password=input.nextLine();

            if(userName.equals("patika")&&password.equals("dev123")){//kullanıcının girdiği bilgiler kontrol ediliyor.
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!" );
                do {
                    //banka yapılacak işlemler
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    //yapılacak işlem seçimleri
                    switch (select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                            price=input.nextInt();
                            balance+=price;
                            System.out.println("hesap bakiyeniz: "+balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("yetersiz bakiye,bakiyeniz: "+balance);
                            }else {
                                balance-=price;
                                System.out.println("hesap bakiyeniz: "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz: "+balance);
                            break;

                        default:
                            System.out.println("Yanlış bir giriş yaptınız, tekrar deneyiniz.");
                    }       break;

                }while(select!=4);
                    System.out.println("Tekrar görüşmek üzere.");
                    break;

            }else{
                //eğer bilgiler hatalı girilirse deneme hakkının durumunu belirtiyoruz.
                right-=1;
                System.out.println("Şifre yada kullanıcı adı yanlış."+right+" hakkınız kaldı.");
                if (right==0){
                    System.out.println("Hesabınız güvenliğiniz için bloke edilmiştir." +
                            "\nBanka ile iletişime geçiniz.");
                }
            }
        }


    }
}