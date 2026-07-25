package DSAJava.Array.MajorityElement;
import java.util.*;
public class MajorityElementBetter {
    public static int MajorityElement(int[]arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]arr = {2,2,1,1,1,2,2};
        System.out.println(MajorityElement(arr));
    }
}
