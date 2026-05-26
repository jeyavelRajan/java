
// Sum of the Numbers in a Given Range
public class NumbersGivenRange {

    // public static void main(String[] args) {

    // int a = 5;
    // int b = 10;
    // int sum = 0;

    // for (int i = a; i <= b; i++) {
    // sum = sum + i;

    // System.out.println(sum);
    // }

    // }

    // method 2 using formula

    // public static void main(String[] args) {

    // int a = 2;
    // int b = 5;

    // int sum = b * (b + 1) / 2 - a * (a + 1) / 2 + a;

    // System.out.println("the sum is " + sum);

    // // calculation behind this

    // // 5*(5+1)/2 - 2*(2+1)/2

    // // 30/2 - 6/2

    // // 15 - 3 = 12 +2 = 14

    // }

    // method 3 using recursion

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int sum = getSum(0, a, b);

        System.out.println("total sum " + sum);
    }

    static int getSum(int sum, int a, int b) {

        if (a > b) {
            return sum;
        }

        return a + getSum(sum, a + 1, b);

    }

}
