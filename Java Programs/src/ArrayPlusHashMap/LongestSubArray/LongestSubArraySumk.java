package ArrayPlusHashMap.LongestSubArray;
import java.util.*;
public class LongestSubArraySumk {
    public static int longestSubArray(int[]arr,int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int prefix = 0, maxLen = 0;
       int start = 0, end = 0;
       for(int i=0;i<arr.length;i++){
           prefix+=arr[i];
           if(prefix==k){
               maxLen = i+1;
               start = 0;
               end = i;
           }
           if(map.containsKey(prefix-k)){
               int prevIndex = map.get(prefix-k);
               int len = i-prevIndex;
               if(len>maxLen){
                   maxLen = len;
                   start = prevIndex+1;
                   end = i;
               }
           }
           if(!map.containsKey(prefix)){
               map.put(prefix,i);
           }
       }
       //Print elements
        System.out.println("Longest SubArray length: " + maxLen);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
        System.out.print("Elements: [");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]);
            if(i!=end) System.out.print(",");
        }
        System.out.println("]");
        return maxLen;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,1,1,1,4,5};
        int k = 3;
        int ans = longestSubArray(arr,k);
        System.out.println("Longest SubArray Length: " +ans);
    }
}
