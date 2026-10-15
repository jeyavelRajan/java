
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int number = sc.nextInt();

        int originalNumber = number;
        int temporaryNumber = number;
        int digitCount = 0;

        while(temporaryNumber>0){
            digitCount ++;
            temporaryNumber = temporaryNumber / 10;
            
        }

        if(digitCount == 0){
            digitCount = 1;
        }

        temporaryNumber = number;
        int sum = 0;

        while(temporaryNumber > 0){
            int digit = temporaryNumber % 10;
            int digitPower = 1;

            for(int i=0;i< digitCount;i++){
                digitPower = digitPower * digit;
            }

            sum = sum + digitPower;
            temporaryNumber = temporaryNumber /10;

        }

            if(number >= 0 && sum == originalNumber){
                System.out.println("it is an armstrong number");
            }else{
                System.out.println("it is not and armstrong number");
            }

            sc.close();

        }
         
    }
