package DSAJava.Array.ContainsDuplicate;
import java.util.*;
public class OptimalApproach {
    public static boolean ContainsDuplicate(int[]arr,int k){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            // Remove the element that goes out of the window
            if(i>k){
                set.remove(arr[i-k-1]);
            }
            // check that if current element already exists
            if(set.contains(arr[i])){
                return true;
            }
            // Add current element
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
       // int[]arr = {1,2,3,4,1};
        int[]arr = {1,2,3,1};
        int k = 3;
        System.out.println(ContainsDuplicate(arr,k));
    }
}
