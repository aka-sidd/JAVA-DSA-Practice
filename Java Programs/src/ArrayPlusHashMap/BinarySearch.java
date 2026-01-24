package ArrayPlusHashMap;

public class BinarySearch {
    public static int[] binarySearch(int[]arr,int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
               return new int[]{mid,arr[mid]};
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,6,8};
        int target = 6;
       int[]result = (binarySearch(arr,target));
        System.out.println("Index = " + result[0]);
        System.out.println("Value = " + result[1]);
    }
}
