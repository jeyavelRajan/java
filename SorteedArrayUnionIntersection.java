import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SorteedArrayUnionIntersection {

    static List<Integer> unionBruteForce(int[] a, int[] b ){
        Set <Integer> values = new TreeSet<>();

        for(int value:a){
            values.add(value);
        }
        
        for(int value:b){
            values.add(value);
        }

        return new ArrayList<>(values);
    }

    static List<Integer> intesectionBruteforce(int[] a, int[] b){
        Set<Integer> valuesInA = new TreeSet<>();
        Set<Integer> commonValues = new TreeSet<>();

        for(int value:a){
            valuesInA.add(value);
        }

        for(int value:b){
            if(valuesInA.contains(value)){
                commonValues.add(value);
            }
        }
        return new ArrayList<>(commonValues);
    }

    static List<Integer> unionTwoPointer(int[] a, int[] b){
        List<Integer> result = new ArrayList<>();
        int i=0;
        int j=0;

        while (i < a.length && j < b.length) {
    if (a[i] < b[j]) {
        addNew(result, a[i]);
        i++;
    } else if (a[i] > b[j]) {
        addNew(result, b[j]);
        j++;
    } else {
        addNew(result, a[i]);
        i++;
        j++;
    }

}

    while(i< a.length){
        addNew(result, a[i]);
        i++;
    } 

    while(j<b.length){
        addNew(result, b[j]);
        j++;
    }

    return result;

    }


    static List<Integer> intersectionTwoPointers(int[]a, int[]b){
        List<Integer> result = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i]> b[j]){
                j++;
            }else{
                addNew(result, a[i]);
                i++;
                j++;
            }
        }
        return result;
    }





    static void addNew(List<Integer> result, int value){
        if(result.isEmpty() || result.get(result.size() - 1)!=value){
            result.add(value);
        }
    }






    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5};
        int[] b = {2, 2, 3, 4, 5, 5};

        System.out.println("Union (set): " + unionBruteForce(a, b));
        System.out.println("intersection (set):"+ intesectionBruteforce(a,b));
        System.out.println("Union t(wo poibnter): " + unionTwoPointer(a, b));
        System.out.println("Intersection (two pointers): " + intersectionTwoPointers(a, b));
    
    
    }
    
}
