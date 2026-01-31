package ArrayPlusHashMap.MajorityElements;

import java.util.HashMap;

public class MajorityElementOptimal {
    public static int majorityElement(int[]nums){
        HashMap<Integer,Integer>map = new HashMap<>();
        //for store frequencies
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            int n = nums.length;
            for(int key:map.keySet()){
                if(map.get(key)>n/2) return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums = {1,2,2,2,2,3,4};
        int ans = majorityElement(nums);
        if(ans!=-1){
            System.out.println("Majority Element is: " + ans);
        }else{
            System.out.println("No Majority Element exists");
        }
    }
}
