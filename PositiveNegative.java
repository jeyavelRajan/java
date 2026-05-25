public class PositiveNegative {

    public static void main(String[] args) {

        int n = -1;

        // if (n > 0) {
        // System.out.println("positive");
        // } else {
        // System.out.println("negetive");
        // }
        // }

        // if else

        // if (n >= 0) {
        // if (n == 0) {
        // System.out.println("zero");
        // } else
        // System.out.println("positive");
        // } else
        // System.out.println("negative");

        // using ternary operator

        if (n == 0) {
            System.out.println("zero");
        } else {
            String result = n > 0 ? "the number is positive" : "number is negative";
            System.out.println(result);
        }

    }

}
