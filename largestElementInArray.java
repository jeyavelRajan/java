
public class largestElementInArray {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number of elements: ");
        // int size = scanner.nextInt();

        // if(size <=0){
        //     System.out.println("thenarray must contain atleast one value");
        //     scanner.close();
        //     return;
        // }

        // int[] numbers = new int[size];

        // System.out.println("enter the "+ size+ "values of the array");

        // for(int i=0;i<size;i++){
        //     numbers[i] = scanner.nextInt();
        // }

        // int largest = numbers[0];
        // for(int i =1; i< size; i++){
        //     if(numbers[i] > largest){
        //         largest = numbers[i];
        //     }
        // }


        // System.out.println("Largest Element:"+ largest);
        // scanner.close();



        int [] numbers = {5, 2, 10, 7 ,9, 1};
        
        int largest = numbers[0];

        for(int i =1; i<numbers.length;i++){
            if(numbers[i]> largest){
            largest = numbers[i];
            }
        }
         System.out.println("the largest number is"+ largest);

    }
       
}
