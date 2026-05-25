public class StringReverseOrder {

    public static void main(String[] args) {

        String rev = "hello motto";

        String revstring = reverseOrder(rev);

        System.out.println(revstring);

    }

    private static String reverseOrder(String rev) {

        String reversedString = "";

        for (int i = 0; i < rev.length(); i++) {

            reversedString = reversedString + rev.charAt(i);
        }

        for (int i = rev.length() - 1; i >= 0; i--) {
            reversedString = reversedString + rev.charAt(i);
        }

        return reversedString;

    }
}
