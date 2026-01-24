package ArrayPlusHashMap;

public class CheckSorted {
    public static boolean isSorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {5,10,3,7};
        System.out.println("arr1 sorted? => " +isSorted(arr1));
        System.out.println("arr2 sorted? => " +isSorted(arr2));
    }
}
