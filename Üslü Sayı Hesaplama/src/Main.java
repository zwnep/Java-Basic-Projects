import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üslü sayının tabanını giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üslü sayının üssünü giriniz: ");
        int us = input.nextInt();

        int sayi = 1;
        for (int i = 1; i <= us; i++){
            sayi *= taban;
        }
        System.out.println("üslü sayımız: " + sayi);

    }
}