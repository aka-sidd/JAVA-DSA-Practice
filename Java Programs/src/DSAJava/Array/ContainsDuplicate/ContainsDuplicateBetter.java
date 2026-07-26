package DSAJava.Array.ContainsDuplicate;
import java.util.*;
public class ContainsDuplicateBetter {
    public static boolean DuplicateBetter(int[]arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[]arr = {1,2,3,1};
        int[]arr1 = {1,2,3,4};
        System.out.println(DuplicateBetter(arr));
        System.out.println(DuplicateBetter(arr1));
    }
}
