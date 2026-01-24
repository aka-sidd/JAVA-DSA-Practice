//Brute force Solution

package ArrayPlusHashMap;
import java.util.*;
public class FirstNonRepeating {
    static int firstNonRepeatingOptimal(int[] nums) {
        // static int firstNonRepeating(int[] arr) {
//        for (int k : arr) {
//            int count = 0;
//            for (int i : arr) {
//                if (k == i) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return k;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[]arr = {4,1,2,3,4,5};
//        int ans = firstNonRepeating(arr);
//        System.out.println("First Non-Repeating character is: " + ans);
//

//in this solution we need two-pass
        //optimal Approach
        HashMap<Integer, Integer> map = new HashMap<>();
        //1st pass- frequency count
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        //2nd pass ->find first element with frequency 1
        for (int x : nums) {
            if (map.get(x) == 1) {
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums = {4,1,2,3,4,5};
        int ans = firstNonRepeatingOptimal(nums);
        System.out.println("First Non-repeating Character is: " + ans);
    }
    }

