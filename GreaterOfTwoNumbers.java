public class GreaterOfTwoNumbers {

    // using if else statements
    // public static void main(String[] args) {

    // int a = 20;
    // int b = 20;

    // if (a == b) {
    // System.out.println("both are equal");
    // } else if (a > b) {
    // System.out.println("a is greater");
    // } else {
    // System.out.println("b is greater");
    // }

    // using terinary operator
    // public static void main(String[] args) {

    // int a = 10;
    // int b = 20;
    // int temp;

    // if (a == b) {
    // System.out.println("both are equal");
    // } else {
    // temp = a > b ? a : b;
    // System.out.println(temp + "is largest");
    // }
    // }

    // Using inbuilt max Function

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("equal");

        } else {
            System.out.println(Math.max(a, b) + " is the greatest");
        }
    }

}
