import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
            C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner input = new Scanner(System.in);

        System.out.print("n’in r’li kombinasyonu için, n sayısını girin:");
        int n = input.nextInt();

        System.out.print("n’in r’li kombinasyonu için, r sayısını girin:");
        int r = input.nextInt();

        int kominasyon = 0;

        int faktöriyelN = 1;
        for (int i = n; i > 0; i--){
            faktöriyelN *= i;
        }

        int faktöriyelR = 1;
        for (int i = r; i > 0; i--){
            faktöriyelR *= i;
        }

        int faktöriyelNR = 1;
        for (int i = (n - r); i > 0; i--){
            faktöriyelNR *= i;
        }

        kominasyon = faktöriyelN / (faktöriyelR * faktöriyelNR);
        System.out.print(kominasyon);

    }
}