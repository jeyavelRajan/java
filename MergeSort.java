
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        
        int[] arr = {5,3,8,2,1};

        mergeSort(arr, 0,arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right){
        if(left >=right){
            return;  //one element or none is already siorted
        }

        int middle = left +(right - left) / 2;

        //Divide the array into two halfes and sort each other 
        
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        

        //combine the sorted values

        merge(arr, left , middle, right);

    }

    static void merge(int[] arr , int left ,int middle ,int right){
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while(i<=middle && j <= right){
            if(arr[i]<= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        //copy any remaining values 
        while(i<= middle){
            temp[k++] = arr[i++];
        }
        while(j<= right){
            temp[k++] = arr[j++];
        }

        //put the merge values into the original array 
        for(int index = 0; index < temp.length; index++){
            arr[left+index] = temp [index];
        }
    }
    
}
