public class GreaterOfThreeNumbers {

    // public static void main(String[] args) {

    // // Using if-else Statements 2

    // int num1 = 10;
    // int num2 = 20;
    // int num3 = 30;

    // if (num1 >= num2 && num1 >= num3) {
    // System.out.println(num1 + " is greater");
    // } else if (num2 >= num1 && num2 >= num3) {
    // System.out.println(num2 + " is greater");
    // } else if (num3 >= num1 && num3 >= num2) {
    // System.out.println(num3 + " is greater");
    // }
    // }

    // Using if-else Statements 2

    // public static void main(String[] args) {

    // int num1 = 10;
    // int num2 = 20;
    // int num3 = 30;

    // if ((num1 >= num2) && (num1 >= num3)) {
    // System.out.println(num1 + " is greater");
    // } else if (num2 >= num1 && num2 >= num3) {
    // System.out.println(num2 + " is greater");

    // } else {
    // System.out.println(num3 + " is greaater");
    // }

    // }

    // Method 3: Using Ternary Operator

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int temp, result;

        temp = num1 > num2 ? num1 : num2;

        result = temp > num3 ? temp : num3;
        System.out.println(result + " is greater");

    }

}
