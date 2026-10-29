
import java.util.Arrays;

public class leftRotateArrayBy1Value {
    // public static void main(String[] args) {
    //     int[] leftRotate= {1,2,4,6,7};

    //     int temp = leftRotate[0];


    //     for(int i = 1 ; i < leftRotate.length ; i++){

    //         leftRotate[i - 1] = leftRotate[i];

    //     }

    //     leftRotate[leftRotate.length - 1] = temp;

    //     System.out.println(Arrays.toString(leftRotate));
    // }


    public static void main(String[] args) {
        int arr[] = {1,2,4,6,4,7};

        int temp = arr[0];

        for(int i = 1 ; i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] =  temp;

        System.out.println(Arrays.toString(arr));
          
    }
    
}
