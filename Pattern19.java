import java.util.Scanner;

public class Pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();

        int inis = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            inis += 2;
            System.out.println();
        }

        inis = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            inis -= 2;
            System.out.println();
        }

    }

}
