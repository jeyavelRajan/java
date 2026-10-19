
import java.util.Scanner;

public class recs_ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // if (i < n) {
            //     System.out.println(i + 1);
            // } else {
            //     System.out.println("loop finished");
            // }

            System.out.println(i + 1);
        }
        System.out.println("loop finished");
    }

}
