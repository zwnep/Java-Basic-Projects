import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculate the are and perimeter of the circle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the r: ");
        double r = input.nextDouble();
        double pi = 3.14;
        double area = 2 * pi * r;
        double perimeter = pi * r * r;
        System.out.print("Area: " + area + "\nPerimeter: " + perimeter);

        //Ödev: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        System.out.println("Enter the center angle measure: ");
        double alfa = input.nextDouble();
        System.out.println("Enter the r: ");
        double r2 = input.nextDouble();
        double area2 = (pi*r2*r2*alfa)/360;
        System.out.println("Area of the circle segment: " + area2);

    }
}
