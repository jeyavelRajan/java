import java.util.Scanner;

public class Pattern22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;
                int value = n - Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
