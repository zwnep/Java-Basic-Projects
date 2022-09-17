import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hypotenuse Calculation");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double side2 = input.nextDouble();
        double hypo = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.println("Hypotenuse of the triangle: " + hypo);

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        System.out.println("Enter the first side of the triangle: ");
        double sideOne = input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double sideSecond = input.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double sideThird = input.nextDouble();
        double u = (sideOne + sideSecond + sideThird)/2;
        double area = Math.sqrt(u*((u-sideOne)*(u-sideSecond)*(u-sideThird)));
        System.out.println("Area of the triangle: " + area);


    }
}
