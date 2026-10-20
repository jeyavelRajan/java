
import java.util.Arrays;

//selection sort
public class Sorting_ex {
    public static void main(String[] args) {

    int arr[] = {5,3,8,2,1};
    int n = arr.length;

    for(int i=0;i<n-1;i++){
         
        int minIndex = i;

        for(int j=i+1; j < n ; j++){

            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }

        }


        //
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;


    }
   System.out.println(Arrays.toString(arr));
}
    
}
