
import java.util.Scanner;

public class recs_ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        printNumbers(n);
    }

    static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.println(n);
    }

}
