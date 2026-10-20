
import java.util.HashMap;
import java.util.Map;

public class hashing_ex1 {

    public static void main(String[] args) {
        int[] numbers ={1,2,3,1,3,2,4};
        Map<Integer,Integer> frequency = new HashMap<>();

        for(int number: numbers){
            frequency.put(number, frequency.getOrDefault(number, 0)+1);
        }
        System.out.println("1 appears " + frequency.getOrDefault(1, 0) + " times");
        System.out.println("2 appears " + frequency.getOrDefault(2, 0) + " times");
        System.out.println("4 appears " + frequency.getOrDefault(4, 0) + " times");
        
    }

    
}
