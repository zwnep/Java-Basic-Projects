import java.util.Scanner;

public class Not_ortalaması {
    public static void main(String[] args) {

        //Create the variables.
        int math, physics, chem, turkish, hist, music;

        //Define the Scanner class.
        Scanner input = new Scanner(System.in);

        //Get user values.
        System.out.print("Enter your math grade: ");
        math = input.nextInt();

        System.out.print("Enter your physics note: ");
        physics = input.nextInt();

        System.out.print("Enter your chemistry note: ");
        chem = input.nextInt();

        System.out.print("Enter your Turkish note: ");
        turkish = input.nextInt();

        System.out.print("Enter your history note: ");
        hist = input.nextInt();

        System.out.print("Enter your music note: ");
        music = input.nextInt();

        double average = (physics + chem + math + turkish + hist + music)/6;
        System.out.println("Average of your course grades: " + average);

        //Without using if-else, if the user's average is greater than 60, it should display "Passed the Class" and if it is less than "Failed in Class".
        String passOrFail = (average > 60) ? "Passed the Class" : "Failed in Class";
        System.out.print("Average: " + average + "\nPass Status: " + passOrFail);


    }
}