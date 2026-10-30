

public class Right_Rotate_Array {


    static void rightRotate(int arr[], int k) {

        int n = arr.length;
        if(n == 0) return;


        k %=n;
        int[] temp = new int [k]; 


        for(int i=0;i<k;i++){
            temp[i] = arr[n-k+i];
        }

        for(int i=n - k - 1; i >= 0; i--){
            arr[i+k] = arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]= temp[i];
        }
        
    }

    static void rightRotateOptimal(int[] arr, int k) {
    int n = arr.length;
    if (n == 0) return;

    k %= n;

    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
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

        rightRotate(bruteForceArray, 3);
        rightRotateOptimal(optimalArray, 4);


        System.out.println("bruteForce right" + java.util.Arrays.toString(bruteForceArray));
        System.out.println("optimal right" + java.util.Arrays.toString(optimalArray));
        
    }
    
}
