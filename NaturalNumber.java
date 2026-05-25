public class NaturalNumber {

    public static void main(String[] args) {

        // using for loop

        // int num = 10;
        // int sum = 0;

        // for (int i = 1; i <= num; i++) {
        // sum += i;

        // System.out.println(sum);
        // }

        // Using Formula for the Sum of Nth Term

        // System.out.println(num * (num + 1) / 2);

        int n = 10;
        int sum = getSum(n);

        System.out.println(sum);

    }

    static int getSum(int n) {

        if (n == 0) {

            return n;
        }
        return n + getSum(n - 1);
    }

}
