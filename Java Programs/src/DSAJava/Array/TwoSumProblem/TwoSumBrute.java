package DSAJava.Array.TwoSumProblem;
import java.util.*;
public class TwoSumBrute {
    public static int[] twoSum(int[]arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){ // N times run outer loop
            for(int j=i+1;j<n;j++){ // N times run inner loop
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]arr = {2,3,5,7};
        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }
}
