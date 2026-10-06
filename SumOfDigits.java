public class SumOfDigits {

    // public static void main(String[] args) {

    // int num = 12345;
    // int sum = 0;

    // while (num != 0) {
    // sum += num % 10;
    // num = num / 10;
    // }

    // System.out.println("sum of digits is " + sum);
    // }

    // public static void main(String[] args) {

    // int num = 12345;
    // int sum = 0;

    // System.out.println("the sum of digits is " + getSum(num, sum));
    // }

    // public static int getSum(int num, int sum) {

    // if (num == 0) {
    // return sum;
    // }

    // sum += num % 10;
    // return getSum(num / 10, sum);
    // }

    // public static void main(String[] args) {

    // int num = 1234567;
    // int sum = 0;

    // System.out.println("the sum of digits is " + getSum(num, sum));
    // }

    // public static int getSum(int num, int sum) {

    // if (num == 0) {
    // return sum;
    // }

    // return (num % 10) + getSum(num / 10, sum);

    // }

    public static void main(String[] args) {

        String num = "9876543219876543219876";

        System.out.println("sum of digits" + getSum(num));
    }

    public static int getSum(String num) {

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum = sum + num.charAt(i) - 48;
        }
        return sum;
    }

}
