// Find elements occuring maximum time....

package ArrayPlusHashMap.CountFrequency;
import java.util.*;
public class OccursMaxTime {
    public static void main(String[] args) {
        int[]arr = {1,3,2,3,4,1,3,2};
        HashMap<Integer,Integer>map = new HashMap<>();
        //count frequency of each element
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        int element = -1;
        //find which element has maximum frequency
        for(int key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq = map.get(key);
                element = key;
            }
        }
        System.out.println("Element occuring maximum time: "+element);
        System.out.println("Frequency: "+maxFreq);

    }
}
