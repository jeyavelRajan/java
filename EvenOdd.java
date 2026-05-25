public class EvenOdd {

    public static void main(String[] args) {
        int eo = 12;

        // if (eo % 2 == 0) {
        // System.out.println("number is even");

        // } else
        // System.out.println("number is odd");

        if (eo == 0) {
            System.out.println("number is zero");
        }
        String status = eo % 2 == 0 ? "number is even" : "number is odd";
        System.out.println(status);
    }

}
