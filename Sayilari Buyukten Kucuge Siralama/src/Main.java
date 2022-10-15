import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("1. sayı: ");
         int num1 = input.nextInt();
        System.out.print("2. sayı: ");
        int num2 = input.nextInt();
        System.out.print("3. sayı: ");
        int num3 = input.nextInt();

        System.out.println("Girilen sayıların sıralanmış hali:");

        if(num1<num3&&num2<num3){
            if (num2>num1){
                System.out.print(num3+">"+num2+">"+num1);
            }
            else{
                System.out.print(num3+">"+num1+">"+num2);
            }
        }
        else if (num1<num2&&num3<num2) {
            if (num3>num1){
                System.out.print(num2+">"+num3+">"+num1);
            }
            else{
                System.out.print(num2+">"+num1+">"+num3);
            }
        }
        else{
            if (num3>num2){
                System.out.print(num1+">"+num3+">"+num2);
            }
            else{
                System.out.print(num1+">"+num2+">"+num3);
            }
        }
    }
}