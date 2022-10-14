import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = input.nextInt();
        System.out.print("Second number: ");
        int num2 = input.nextInt();

        System.out.println("1 - Addition\n2 - Subtraction\n3 - Divide\n4 - Multiplication");
        System.out.print("Selection: ");
        int selection = input.nextInt();

        switch (selection){
            case 1:
                System.out.println("Sum: " + (num1+num2));
                break;
            case 2:
                System.out.println("Subtraction:" + (num1*num2));
                break;
            case 3:
                if (num2!=0){
                    System.out.println("Divide: " + (num1/num2));
                }
                else{
                    System.out.println("Divide by zero error encountered.");
                }
                break;
            case 4:
                System.out.println("Multiplication:" + (num1*num2));
                break;
        }



    }
}