package ArrayPlusHashMap.CountFrequency;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int target = 4;
        int count = 0;
//        for(int num:arr){
//            if(num==target){
//                count++;
//            }
//        }
//        System.out.println(target + " appears " + count + "times");
//    }


//Using HAshMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(target + "appears " + map.getOrDefault(target, 0) + "times");
    }
}
