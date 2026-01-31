package ArrayPlusHashMap.TwoSum;
import java.util.*;
public class TwoSumUsingHashMap {
    public static int[]twoSum(int[]arr,int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed = target-arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1}; // not found
    }
    public static void main(String[] args) {
        //few lines of code in user input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[]arr = new int[n];
//        System.out.println("Enter elements of Array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter target");
//        int target = sc.nextInt();
//        int[]result = twoSum(arr,target);
      int[]arr = {2,7,11,15};
      int[]result = twoSum(arr,9);
       if(result[0]!=-1){
           System.out.println("Indexes are: " +Arrays.toString(result));
           System.out.println("Values are: " + arr[result[0]] + " and " + arr[result[1]]);
       }else {
           System.out.println("No Pair found");
       }
//       sc.close();
    }
}
