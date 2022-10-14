import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        String user_name = input.nextLine();

        if (user_name.equals("zwnep")){
            System.out.println("Kullanıcı Adı Doğru.");

            System.out.print("Şifreniz:");
            String user_password = input.nextLine();

            if (user_password.equals("java101")){
                System.out.println("Güvenle giriş yapıldı. ");
            }
            else{
                System.out.println("Hatalı Şifre Girişi!");

                System.out.println("Şifreni mi unuttun? / Şifre sıfırlamak istiyor musunuz?\nEVET:E - HAYIR:H");
                String secim = input.nextLine();
                if(secim.equals("E")){
                    System.out.println("Yeni girilen şifre eski şifre ve hatalı girilen şifre ile aynı olmadığına dikkat edin!\nYeni Şifre: ");
                    String n_user_password = input.nextLine();
                    if (n_user_password.equals(user_password)||n_user_password.equals("java101")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Yeni şifre oluşturuldu.");
                    }
                }
                else{
                    System.out.println("Kullanıcı bilgilerinizi tekrar girin.");
                }
            }
        }
        else{
            System.out.println("Hatalı Bilgi Girişi");
        }
    }
}