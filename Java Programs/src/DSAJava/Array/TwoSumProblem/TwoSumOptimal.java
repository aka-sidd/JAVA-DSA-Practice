package DSAJava.Array.TwoSumProblem;
import java.util.*;
public class TwoSumOptimal {
    public static int[] twoSum(int[]arr,int target){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int current = arr[i];
            int complement = target - current;

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(current,i);
        }
           return new int[]{-1,-1};
    }

   public static void main(String[] args) {
        int[]arr = {2,3,5,6};
       System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
