//Check if two elements are equal...
package ArrayPlusHashMap.EqualsArray;
import java.util.*;
public class TwoEqualsArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2};
        int[] arr2 = {2, 3, 2, 1,4};
        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are not Equal");
        }
    }

    public static boolean areEqual(int[] arr1, int[] arr2) {
        //1) sizes different->Not Equal
        if (arr1.length != arr2.length) {
            return false;
        }
        //Count frequencies of each element of arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //reduce freq of arr2
        for (int num : arr2) {
            if (!map.containsKey(num)) {
                return false; // arr2 me koi element extra mil gya
            }
            map.put(num, map.get(num) - 1);
        }
        //Check freq should be zero
        for (int key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
