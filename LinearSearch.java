import java.util.Arrays;

public class LinearSearch {


    static int linearSearchAsc(int[] arr, int target){

        for(int i=0; i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearchDec(int[] arr, int target){
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,9};
        int target = 7;

        System.out.println("in linearSeaech ASC ="+Arrays.toString(numbers));
          System.out.println("Found from front at index: " + linearSearchAsc(numbers, target));
        System.out.println("Found from end at index: " + linearSearchDec(numbers, target));
        
    }
    
}
