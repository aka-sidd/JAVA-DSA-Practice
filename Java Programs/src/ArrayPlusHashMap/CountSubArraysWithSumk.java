package ArrayPlusHashMap;
import java.util.*;
public class CountSubArraysWithSumk {
    public static int countSubArrays(int[]arr,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int prefix = 0, count = 0;
        for(int x:arr){
            prefix+=x;
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
               map.put(prefix,map.getOrDefault(prefix ,0)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {1,1,1};
        int k = 2;
        System.out.println("Count of SubArrays is: " +countSubArrays(arr,k));
    }
}
