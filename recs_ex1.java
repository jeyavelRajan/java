
import java.util.Scanner;

public class recs_ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        System.out.println("enter the i value");
        int i=sc.nextInt();

        int printedCount = printName(i, n);
        System.out.println("Printed " + printedCount + " times.");


    }

    public static int printName(int i, int n) {
        if (i > n) {
            return 0;
        }

        System.out.println("jeyavel");
        return 1 + printName(i + 1, n);
    }
}
