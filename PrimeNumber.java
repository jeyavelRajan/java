
import java.util.Scanner;

public class PrimeNumber {

    // public static void main(String[] args) {

    // int pr = 23;
    // checkPrime(pr);
    // }

    // private static void checkPrime(int pr) {

    // int count = 0;

    // if (pr < 2) {
    // System.out.println("the given number is " + pr + "not prime number");
    // System.exit(0);
    // }

    // for (int i = 1; i <= pr; i++) {
    // if (pr % i == 0) {
    // count += 1;
    // }

    // if (count == 2) {
    // System.out.println(pr + "it is prime number");
    // } else {
    // System.out.println(count + "is not an prime number");
    // }
    // }

    // }

    // public static void main(String[] args) {

    // int pr = 23;
    // boolean isPrime = true;

    // if (pr < 2) {
    // isPrime = false;
    // } else {

    // for (int i = 2; i < pr; i++) {
    // if (pr % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }

    // String result = isPrime ? " is prime" : " is not prime";
    // System.out.println(pr + "the value " + result);
    // }

    // }

    // public static void main(String[] args) {

    // int i, pr = 33;
    // boolean isPrime = true;

    // if (pr < 2) {
    // isPrime = false;
    // // System.out.println(pr + " is not an prime");
    // } else {
    // for (i = 2; i <= pr / 2; i++) {
    // if (pr % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // String result = isPrime ? " is an prime" : " not an prime";
    // System.out.println(pr + " the value" + result);
    // }
    // }

    // public static void main(String[] args) {

    // int i, pr = 29;
    // boolean isPrime = true;

    // if (pr < 2) {
    // isPrime = false;
    // } else {

    // for (i = 2; i <= Math.sqrt(pr); i++) {
    // if (pr % i == 0) {
    // isPrime = false;
    // break;
    // }

    // }
    // }
    // String result = isPrime ? " is prime" : " is not prime";
    // System.out.println(pr + "the value " + result);
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int pr = sc.nextInt();

        if (isPrime(pr)) {
            System.out.println(pr + " is an prime number");
        } else {
            System.out.println(pr + " is not an prime number");
        }
    }

    static boolean isPrime(int pr) {

        if (pr <= 1) {
            return false;
        }

        else if (pr == 2) {
            return true;
        }

        else if (pr % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(pr); i += 2) {
            {
                if (pr % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
