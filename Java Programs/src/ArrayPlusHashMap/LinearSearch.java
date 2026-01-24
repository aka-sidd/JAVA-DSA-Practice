package ArrayPlusHashMap;

public class LinearSearch {
    public static int[] linearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return new int[]{i,arr[i]};
            }
        }
        System.out.println("Value not found");
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]arr = {4,5,2,9,7,6};
        int target = 9;
        int[]result = linearSearch(arr,target);
        System.out.println("Index = " +result[0]);
        System.out.println("Value = " +result[1]);

    }
}
