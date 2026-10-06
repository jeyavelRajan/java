public class ListOfPrimeNumbersInRange {

    public static void main(String[] args) {

        int least = 1;
        int most = 20;

        for (int i = least; i <= most; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
