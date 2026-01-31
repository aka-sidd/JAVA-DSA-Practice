package ArrayPlusHashMap.CountFrequency;
import java.util.HashMap;
public class FrequencyOfEachElement {
    public static HashMap<Integer,Integer> FindFreq(int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,1,3,1,2,2,1};
        HashMap<Integer,Integer>freq = FindFreq(arr);
        //Print frequency
        for(Integer key:freq.keySet()){
            System.out.println(key +"->" +freq.get(key));
        }
    }

}