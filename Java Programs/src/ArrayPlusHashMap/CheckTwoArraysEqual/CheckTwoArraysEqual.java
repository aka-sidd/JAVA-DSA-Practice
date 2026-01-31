package ArrayPlusHashMap.CheckTwoArraysEqual;
import java.util.*;
public class CheckTwoArraysEqual {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,2};
        int[]arr2 = {2,3,2,1};
        if(areEqual(arr1,arr2)){
            System.out.println("Arrays are Equal");
        }else{
            System.out.println("Arrays are NOT Equal");
        }
    }
    public static boolean areEqual(int[]arr1,int[]arr2){

        //1) Sizes different => Not Equal
        if(arr1.length!=arr2.length)
            return false;
        HashMap<Integer,Integer>map = new HashMap<>();

        //2)Count freq of arr1 element
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //3)Reduce frequency using arr2
        for(int num:arr2){
            if(!map.containsKey(num)){
                return false; // arr2 me koi extra elements mil gya..
            }
            map.put(num,map.get(num)-1);
        }
        //check freq zero honi chahiye
        for(int key:map.keySet()){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}
