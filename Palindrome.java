import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        int orginal = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }

        if (orginal == reverse) {
            System.out.println("it is an palindrome number");
        } else {
            System.out.println("It is not an palindrome number");
        }
    }

}
