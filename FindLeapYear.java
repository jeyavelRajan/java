public class FindLeapYear {

    // Method 1: Using if-else Statements 1
    // public static void main(String[] args) {
    // int year = 2020;

    // if (year % 400 == 0) {
    // System.out.println(year + " is an leap year");
    // } else if (year % 4 == 0 && year % 100 != 0) {
    // System.out.println(year + " leap year");
    // } else
    // System.out.println(year + "is not leap year");
    // }

    // Method 2: Using if-else Statements 2
    // public static void main(String[] args) {

    // int year = 2021;

    // if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
    // System.out.println(year + " is leap year ");
    // } else
    // System.out.println(year + " is not leap year");

    // }

    // Method 3: Using Ternary Operator

    // public static void main(String[] args) {

    // int year = 2024;

    // int flag = (year % 400 == 0) || (year % 400 != 0) ? 1 : 0;

    // if (flag == 1) {
    // System.out.println(year + " is an leap year");
    // } else {
    // System.out.println(year + " is not an leap year");
    // }

    // }

    // Method 4: Bonus Boolean Method

    public static void main(String[] args) {

        int year = 2024;
        boolean leap;

        if (year % 400 == 0) {
            leap = true;
        } else if (year % 4 != 0) {
            leap = true;
        }

        else
            leap = false;

        if (leap = true) {
            System.out.println(year + " is an leap year");
        } else {
            System.out.println(year + " is not an leap year");
        }

    }

}
