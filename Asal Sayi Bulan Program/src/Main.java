import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        if (asal_mi(sayi,2)){
            System.out.println(sayi + " sayısı asaldır.");
        }
        else {
            System.out.println(sayi + " sayısı asal değildir.");
        }

    }
    static boolean asal_mi(int sayi,int index){
        if (sayi<=2) return (sayi == 2) ? true : false;

        if (sayi % index == 0) return false;

        if (sayi == index) return true;

        return asal_mi(sayi,(index+1));
    }
}