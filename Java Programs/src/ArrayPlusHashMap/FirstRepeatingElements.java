package ArrayPlusHashMap;
import java.util.*;
public class FirstRepeatingElements {
    static int firstRepeating(int[] arr) {
//       for(int i=0;i<arr.length;i++){
//           int count = 0;
//           for(int j=0;j<arr.length;j++){
//               if(arr[i]==arr[j]){
//                   count++;
//                }
//            }
//            if (count > 1) {
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[]arr = {4,1,2,5,2,4,7};
//        int ans = firstRepeating(arr);
//        System.out.println("First Repeating Elements is: " + ans);
//    }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 2, 4, 7};
        int ans = firstRepeating(arr);
        System.out.println("First Repeating Elements is: " + ans);
    }
}
