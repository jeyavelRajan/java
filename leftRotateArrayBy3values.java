
import java.util.Arrays;

public class leftRotateArrayBy3values{


    static void leftOverRotate(int[] arr,int k){
            int n = arr.length;
            if(n==0)return;


            int[] temp = new int[k];
            
            k %=n;

            for(int i=0;i<k;i++) {
                temp[i] = arr[i];
            }

            for(int i=k;i<n;i++){
                arr[i-k] = arr[i];
            }

            for(int i=0;i<k;i++){
                arr[n-k+i] = temp[i];
            }

        }

        static void leftRotateOptimal(int[] arr, int k) {
            int n = arr.length;
            if(n == 0) return;

            k %=n;

            reverse(arr, 0, k -1);
            reverse(arr, k, n-1);
            reverse(arr, 0, n-1);
        }

        static void reverse(int[] arr, int left, int right){
            while(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
        }

    public static void main(String[] args) {

        int[] bruteForceArray = {1, 2, 3, 4, 5, 6, 7};
        int[] optimalArray = {1, 2, 3, 4, 5, 6, 7};

        leftOverRotate(bruteForceArray, 3);
        leftRotateOptimal(optimalArray, 4);

        System.out.println("Brut force"+ Arrays.toString(bruteForceArray));
        System.out.println("optimal solution"+Arrays.toString(optimalArray));
    }

    
}