import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        // Stop when this part of the array has zero or one element.
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        // The pivot is in its final position; sort the parts on either side.
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    static int partition(int[] arr, int low, int high) {
        // This version chooses the first value in the current range as pivot.
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Find a value greater than the pivot on the left.
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            // Find a value less than or equal to the pivot on the right.
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            // Swap misplaced values while the pointers have not crossed.
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Put the pivot between the smaller and larger values.
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
