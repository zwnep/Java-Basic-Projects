import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Hava sıcaklığı: ");
        int hava_sicaklik = input.nextInt();

        String oneri = (hava_sicaklik<5) ? "Bu havada kayak yapabilirsin."
                : (5<=hava_sicaklik&&hava_sicaklik<15) ? "Sinemaya gidip güzel bir film izleyebilirsin."
                : (15<=hava_sicaklik&&hava_sicaklik<25) ? "Arkadaşlarınla pikniğe gidebilirsin"
                : "Yüzmek için mükemmel bir hava.";

        System.out.print(oneri);
    }
}