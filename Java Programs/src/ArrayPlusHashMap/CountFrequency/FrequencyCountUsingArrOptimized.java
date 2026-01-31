package ArrayPlusHashMap.CountFrequency;
import java.util.*;
public class FrequencyCountUsingArrOptimized {
    public static void main(String[] args) {
        int[]arr = {2,5,2,3,2,4,3};
        Arrays.sort(arr); //step:1> Sort
        int n = arr.length;
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                System.out.println(arr[i-1]+"->"+count);
                count = 1;
            }
        }
        //print the last element is mandatory
        System.out.println(arr[n-1]+"->"+count);
    }
}
