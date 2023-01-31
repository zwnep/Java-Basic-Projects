import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girişi: ");
        int sayi = input.nextInt();
        int basamak = 0;
        int toplam = 0;
        while (sayi != 0){
            basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.print("Girilen sayının basamakları toplamı: " + toplam);

    }
}