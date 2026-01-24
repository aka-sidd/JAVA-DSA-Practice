package ArrayPlusHashMap;

public class SmallestAndSecondSmallest {
    public static int[] findSmallestAndSecondSmallest(int[]arr){
        int smallest = arr[0], smallestIndex = 0;
        int secondSmallest = Integer.MAX_VALUE, secondSmallestIndex = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                secondSmallestIndex = smallestIndex;
                smallest = arr[i];
                smallestIndex = i;
            }
            else if(arr[i]<secondSmallest&& arr[i]!=smallest){
                secondSmallest  = arr[i];
                secondSmallestIndex = i;
            }
        }
        return new int[]{smallest, smallestIndex,secondSmallest,secondSmallestIndex};
    }
    public static void main(String[] args) {
        int[]arr = {2,1,4,5,3};
        int[]result = findSmallestAndSecondSmallest(arr);
        System.out.println("Smallest Value are: = " +result[0] +"| Index are: = " +result[1]);
        System.out.println("SecondSmallest Value are: = " +result[2] +" |Index are: = " +result[3]);
    }
}
