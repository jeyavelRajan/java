public class RemoveDuplicatesinArray {

    public static void main(String[] args) {
        
        int[] numbers = {1,1,2,2,3,3,4};

        int uniqueCount = 1;

        for (int i=1 ; i<numbers.length;i++){
            if(numbers[i] != numbers[uniqueCount - 1]){
                numbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("without duplicates :" + uniqueCount);
        // for(int i=0;i<uniqueCount; i++){
        //     System.out.println("uniqueCount:"+numbers [i]+ " ");
        // }
        // System.out.println("without dupliicates:"+uniqueCount);
    }


    
}
