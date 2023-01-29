import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.print("Sayı Girin: ");
        int sayi = input.nextInt();

        int kat;
        for(int i = 1; i < sayi; i++){
            if(i % 20 == 0) System.out.println(i);
        }
    }
}