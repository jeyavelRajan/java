import java.util.Arrays;

public class Bubble_Sort_example {

    public static void main(String[] args) {
       int arr[] = {1,2,9,5,6};
       int swap = 0;
       int compare = 0;
       int passes = 0;

       System.out.println("Before sorting"+Arrays.toString(arr));
       for(int i=0;i<arr.length -1;i++){
        boolean swapped = false;
        passes++;

        for(int j=0; j<arr.length -1 ; j++){
            compare++;

            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
                swapped = true;
            }
        }
        System.out.println("After pass " + passes + ": " + Arrays.toString(arr));
        if(!swapped){
            break;
        }

       }

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Passes: " + passes);
        System.out.println("Comparisons: " + compare);
        System.out.println("Swaps: " + swap);


     }
}
