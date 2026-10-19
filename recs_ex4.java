
import java.util.Scanner;

public class recs_ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value N");
        int n = sc.nextInt();


        System.out.println("1 to N");
        print1toN(n);


        System.out.println("N to 1");
        printNto1(1, n);
        
    }
    

    static void print1toN(int number){
        if(number < 1){
            return;
        }

        print1toN(number - 1 );
        System.out.println(number);

    }


    static void printNto1(int number, int n){
        if(number>n){
            return;

        }
        printNto1(number + 1, n);
        System.out.println(number);

    }
}
