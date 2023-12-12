import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,select,newPassword;

        Scanner input= new Scanner(System.in);
        System.out.println("kullanıcı adını giriniz: ");//kullanıcıdan kullanıcı adı istiyoruz.
        userName=input.nextLine();

        System.out.println("şifrenizi giriniz: ");//kullanıcıdan şifresini girmesini istiyoruz.
        password=input.nextLine();

        //kullanıcı adı ve şifre doğru ise (kullanıcı adı:patika -- şifre:java123)
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("giriş yaptınız.");

        //şifre yanlış ise değiştirmek isteyip istemediğini soruyoruz.
        }else {
            System.out.println("hatalı giriş yaptınız\nşifrenizi değiştirmek mi istiyorsunuz:\nyes:y\nno:n");
            select=input.nextLine();

            //y--n seçimine göre işlemleri tanımlıyoruz.
            switch (select){
                case "n":
                    System.out.println("çıkış yapılıyor...");
                    break;
                case "y":
                    System.out.println("yeni şifrenizi giriniz: ");
                    newPassword=input.nextLine();

                    //eğer yeni şifre eski şifre(java123) ile aynı ise farklı bir şifre girmesini istiyoruz.
                    if (newPassword.equals("java123")){
                        System.out.println("şifreniz eski şifre ile aynı olamaz.Tekrar deneyiniz: ");
                        newPassword=input.nextLine();

                        //yeni şifre eski şifreden farklı ise;
                        if(!newPassword.equals("java123")){
                            System.out.println("şifreniz oluşturuldu.");
                        }
                        //yeni şifre eski şifre ile aynı ise;
                        else {
                            System.out.println("daha sonra tekar deneyiniz: ");
                        }
                    }else{
                        System.out.println("şifreniz oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("yanlış bir seçim yaptınız.çıkış yapılıyor.");
                    break;

            }
        }

    }
}