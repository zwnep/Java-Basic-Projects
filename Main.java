import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double km, normal_ucret, mesafe_ucret = 0.1;
        int yas, yolculuk_tipi;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();
        normal_ucret = km * mesafe_ucret;

        System.out.print("Lütfen yaşınızı girin: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipiniz TEK YÖN ise 1'e GİDİŞ-DÖNÜŞ ise 2'ye basın: ");
        yolculuk_tipi = input.nextInt();

        if((km > 0) && (yas > 0) && ((yolculuk_tipi == 1)||(yolculuk_tipi == 2)))
        {
            if (yolculuk_tipi == 1){
                if(yas < 12){
                    normal_ucret -= (normal_ucret * 0.5);
                }
                if(yas<24 || yas>12){
                    normal_ucret -= (normal_ucret * 0.1);
                }
                if (yas>65){
                    normal_ucret -= (normal_ucret * 0.3);
                }
            }
            if(yolculuk_tipi == 2){
                if(yas < 12){
                    normal_ucret -= (normal_ucret * 0.5);
                    normal_ucret -= (normal_ucret * 0.2);
                }
                if(yas<24 || yas>12){
                    normal_ucret -= (normal_ucret * 0.1);
                    normal_ucret -= (normal_ucret * 0.2);
                }
                if (yas>65){
                    normal_ucret -= (normal_ucret * 0.3);
                    normal_ucret -= (normal_ucret * 0.2);
                }
            }
        }
        else {
            System.out.print("Hatalı Veri Girdiniz!");
        }

        System.out.print("Ödencek Toplam Tutar: " + normal_ucret);

    }
}