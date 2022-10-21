import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hesap makinesinin fonksiyonları:");
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n";

        Scanner input = new Scanner(System.in);
        int secim;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alan_cevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);
    }
    static void plus(){
        Scanner input = new Scanner(System.in);
        int toplam = 0, sayi = 0, i = 1;
        while (true){
            System.out.println(i++ +" Sayı: ");
            sayi = input.nextInt();
            if (sayi == 0){
                break;
            }
            toplam += sayi;
        }
        System.out.println("Sonuç:" + toplam);
    }
    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int adet = input.nextInt();
        int sonuc = 0;

        for (int i = 1; i <= adet; i++){
            System.out.println(i +". sayı: ");
            int sayi = input.nextInt();
            if (i == 1) {
                sonuc+=sayi;
                continue;
            }
            sonuc-=sayi;
        }
    }
    static void times(){
        Scanner input = new Scanner(System.in);
        int sonuc = 1, i = 1;

        while (true){
            System.out.println(i++ +". sayı: ");
            int sayi = input.nextInt();
            if (sayi==0){
                break;
            }
            sonuc*=sayi;
        }
        System.out.println("Sonuç: " + sonuc);
    }
    static void divided(){
        Scanner input = new Scanner(System.in);
        double sonuc = 0.0;
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int adet = input.nextInt();

        for (int i = 1; i <=adet ; i++){
            System.out.print(i + ". sayı :");
            double sayi = input.nextDouble();
            if (sayi==0){
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i==1){
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }
        System.out.println("Sonuç : " + sonuc);
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Modu alınacak sayı: ");
        int sayi = input.nextInt();
        System.out.println("Mod: ");
        int mod = input.nextInt();
        int mod_sayi = sayi % mod ;
        System.out.println("Sonuç: " + mod_sayi);
    }
    static void alan_cevre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunun giriniz :");
        int kenar1 = sc.nextInt();
        System.out.print("İkinci kenar uzunluğunun giriniz :");
        int kenar2 = sc.nextInt();
        int alan, cevre;
        cevre=2*(kenar1+kenar2);
        alan=kenar1*kenar2;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
        System.out.println("Dikdörtgenin alanı: " + alan);
    }
}