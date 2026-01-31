package ArrayPlusHashMap.FindAllduplicate;
import java.util.HashMap;
public class FindAllDuplicateOptimal {
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,3,4,4,4,5,6};
        HashMap<Integer,Integer>map = new HashMap<>();
        //step:1> store frequency
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //step:2> print only duplicates
        for(int key: map.keySet()){
            if(map.get(key)>1){
                System.out.println(key + "->" + map.get(key) +" times");
            }
        }
    }
}

