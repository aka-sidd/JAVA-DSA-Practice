package ArrayPlusHashMap.MissingAndRepeating;
import java.util.*;
public class FindMissingAndRepeating {
    public static int[]findMissingAndRepeat(int[]arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x:arr) map.put(x,map.getOrDefault(x,0)+1);
        int missing = -1, repeating = -1;
        for(int i= 1;i<arr.length;i++){
            if(!map.containsKey(i)) missing = i;
            else if(map.get(i)>1) repeating = i;
        }
        return new int[]{missing,repeating};
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,6,4,1};
       int[]result = findMissingAndRepeat(arr);
        System.out.println("Missing Number: " + result[0]);
        System.out.println("Repeating Number: " + result[1]);
        }
    }
