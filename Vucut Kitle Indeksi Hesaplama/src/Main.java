import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double weight = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz: " + BMI);
    }
}