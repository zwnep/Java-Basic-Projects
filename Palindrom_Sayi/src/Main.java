import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        isPalindrom(888);
    }

    static void isPalindrom(int number){
        int temp = number, reversed_number = 0, lastnum;
        System.out.println("Number => " + temp);
        while (temp!=0) {
            lastnum = temp % 10;
            reversed_number = (reversed_number * 10) + lastnum;
            temp /= 10;
        }
        if (reversed_number == number){
            System.out.println("Yey! It's a Palindrom Number.");
        }
        else{
            System.out.println("Oopps! It's not a Palindrom Number.");
        }
    }
}