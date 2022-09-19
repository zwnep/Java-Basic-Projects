import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        // toplam tutarını ekrana yazdıran programı yazın.

        //Meyveler ve Sebze KG Fiyatları
        //
        //        Armut : 2,14 TL
        //        Elma : 3,67 TL
        //        Domates : 1,11 TL
        //        Muz: 0,95 TL
        //        Patlıcan : 5,00 TL

        Scanner input = new Scanner(System.in);
        System.out.print("ARMUT kaç kilo: ");
        int armut = input.nextInt();
        System.out.print("ELMA kaç kilo: ");
        int elma = input.nextInt();
        System.out.print("DOMATES kaç kilo: ");
        int domates = input.nextInt();
        System.out.print("MUZ kaç kilo: ");
        int muz = input.nextInt();
        System.out.print("PATLICAN  kaç kilo: ");
        int patlıcan = input.nextInt();

        double armutFiyat = 2.14 * armut;
        double elmaFiyat =  3.67 * elma;
        double domatesFiyat = 1.11* domates;
        double muzFiyat = 0.95 * muz;
        double patlıcanFiyat = 5.00 * patlıcan;
        double toplam = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlıcanFiyat;

        System.out.println("Muz: " + muzFiyat + "\nPatlıcan: " + patlıcanFiyat + "\nDomates: " + domatesFiyat + "\nElma: " + elmaFiyat + "\nArmut: " + armutFiyat);
        System.out.println("Toplam fiyat: " + toplam);

    }
}