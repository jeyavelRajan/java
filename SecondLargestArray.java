public class SecondLargestArray {

    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4 ,56, 78, 10};

        int largest = numbers[0];
        int secondLargest = 0;
        boolean hasSecondLargest = false;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                hasSecondLargest= true;
            }
            else if(numbers[i] < largest &&(!hasSecondLargest || numbers[i]> secondLargest)){
                secondLargest =  numbers[i];
                hasSecondLargest = true;
            }

            if(hasSecondLargest) {
                System.out.println("Second Largest"+ secondLargest);
            }else{
                System.out.println("there is no second largest");
            }
        }
    }
    
}
