
import java.util.Scanner;

public class sumOfDivisiors {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the positive number");

        int number = sc.nextInt();

        System.out.println("Divisiors of"+ number+"are");

        for(int divisor = 1; divisor <=number ; divisor ++){
            if(number % divisor == 0){
                System.out.println(divisor);
            }
        }

        sc.close();
    }
    
}
