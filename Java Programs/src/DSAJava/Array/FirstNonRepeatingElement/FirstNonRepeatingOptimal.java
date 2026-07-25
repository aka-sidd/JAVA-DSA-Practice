package DSAJava.Array.FirstNonRepeatingElement;
import java.util.*;
public class FirstNonRepeatingOptimal {
    public static int firstNonRepeating(int[]arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        //Count frequency
        for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        //First Non-Repeating Element
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
