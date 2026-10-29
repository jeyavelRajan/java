public class SortedArrayOrNot {


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        boolean isSorted = true;

        for(int i=1; i < numbers.length ; i++){
            if(numbers[i] < numbers[i -1]){
                isSorted = false;
                break;
            }

        }

        if(isSorted){
            System.out.println("the array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }
    }
    
}
