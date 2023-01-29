import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyelini almak istediğiniz sayıyı girin: ");
        int number = input.nextInt();

        int faktöriyel = 1;
        for (int i = number; i > 0; i--){
            faktöriyel *= i;
        }
        System.out.print(faktöriyel);
    }
}