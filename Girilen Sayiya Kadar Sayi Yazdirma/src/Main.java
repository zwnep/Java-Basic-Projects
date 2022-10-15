import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girişi: ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            if ((i%4==0) && (i%3==0)){
                System.out.println(i);
            }
        }
    }
}