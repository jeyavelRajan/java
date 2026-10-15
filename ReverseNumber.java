import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // int number = 12345;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while(number !=0){
            int digits = number%10;
            reversedNumber = reversedNumber * 10 + digits;
            number = number / 10;
        }

        

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
