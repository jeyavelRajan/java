
import java.util.Arrays;

public class MoveZerosToEnd {
    
    static void moveZeroBybrute(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for(int value: arr){
            if(value!= 0){
              temp[index++] = value;
            }
        }

        for(int i=0;i< arr.length;i++){
            arr[i] = temp[i];
        }
    }

    static void moveZeroByOptimal(int[] arr){

        int index =0;

        for(int value:arr){

            if(value!=0){
                arr[index++] = value;
            }
            

            while(index<arr.length){
                arr[index++] = 0;  
            }

        }

    }


    public static void main(String[] args) {
        int[] bruteArray = {0, 1, 0, 3, 12};
        int[] optimalArray = {0, 1, 0, 3, 12};

        moveZeroBybrute(bruteArray);
        moveZeroByOptimal(optimalArray);

        System.out.println("Brute force: " + Arrays.toString(bruteArray));
        System.out.println("optimal: " + Arrays.toString(optimalArray));
    }
    
}
