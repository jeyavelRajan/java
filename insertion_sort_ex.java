  import java.util.Arrays;


public class insertion_sort_ex {

  
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift larger elements one slot to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 5, 8, 2};
        System.out.println("Before: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}


// - key → stores the value to insert safely.
// - arr[j + 1] = arr[j] → shifts a larger value right.
// - j-- → moves backward to check the previous element.
// - arr[j + 1] = key → inserts the key into its correct position.
// One simple rule to remember: Values shift right, j moves left, and key is inserted at the end.