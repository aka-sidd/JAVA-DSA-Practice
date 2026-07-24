package DSAJava.Array;
import java.util.*;
public class LongestConsecutiveSequence {
    //Brute Force Approach
    public static int longestConsecutive(int[]arr){
        int n = arr.length;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            int current = arr[i];
            int length = 1;
            while(linearSearch(arr,current+1)){
                current ++;
                length++;
            }
            maxLen = Math.max(maxLen,length);
        }
        return maxLen;
    }
    public static boolean linearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr = {100,200,1,3,2,4};
        System.out.println(longestConsecutive(arr));
    }


//Better Solution

public static int longestConsecutiveBetter(int[]arr) {
    int n = arr.length;
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
        int current = 1;
        int length = 1;
        while (set.contains(current + 1)) {
            current++;
            length++;
        }
        maxLen = Math.max(maxLen, length);
    }
    return maxLen;
}

//Optimal Solution
public static int longestConsecutiveOptimal(int[]arr) {
    int n = arr.length;
    if (arr.length == 0) {
        return 0;
    }
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }
    int maxLen = 0;
    //Traverse every element
    for (int num : arr) {
        if (!set.contains(num - 1)) {
            int current = num;
            int length = 1;
            while (set.contains(current + 1)) {
                current++;
                length++;
            }
            maxLen = Math.max(maxLen, length);
        }
    }
    return maxLen;
}
}
