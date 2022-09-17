import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        KDV tutarını hesaplayıp ekrana bastıran programı yazın. (Not : KDV tutarını 18% olarak alın)
            KDV'siz Fiyat = 10;
            KDV'li Fiyat = 11.8;
            KDV tutarı = 1.8;
        Ödev: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */
        double kdvRate;
        double price;
        double kdvPrice;
        boolean kdvValue;

        Scanner input = new Scanner(System.in);
        System.out.print("Toplam tutarı giriniz: ");
        price = input.nextDouble();

        kdvValue = (0 < price) && (price < 1000);
        kdvRate = kdvValue ? 0.18 : 0.08;

        System.out.println("---------------------------------");
        System.out.println("Girilen oran " + kdvRate + " oranında hesaplanacaktır.");
        kdvPrice = price + (price * kdvRate);

        System.out.println("--------------------------------------");
        System.out.println("| KDV'siz Tutar:| "+ price);
        System.out.println("| --------------|--------------------|");
        System.out.println("| KDV oranı    :| "+ kdvRate);
        System.out.println("| --------------|--------------------|");
        System.out.println("| KDV'li Tutarı:| "+ kdvPrice);
        System.out.println("--------------------------------------");








    }
}