import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int giris , toplam = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayı girin: ");
            giris = input.nextInt();

            if ((giris%2==0) && (giris%4==0)){
                toplam+=giris;
            }
        }
        while (giris % 2 == 0);

        System.out.print("Girilen sayılardan çift ve 4'ün katı olan sayıların toplamı: " + toplam);

    }
}