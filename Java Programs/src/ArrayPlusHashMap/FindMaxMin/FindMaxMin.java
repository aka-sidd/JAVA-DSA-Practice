package ArrayPlusHashMap.FindMaxMin;

public class FindMaxMin {
    public static int[] findMinMax(int[]arr){
        int n = arr.length;
        int max = arr[0], min = arr[0];
        int maxIndex = 0,minIndex = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }

        return new int[]{max, maxIndex,min, minIndex};
    }
    public static void main(String[] args) {
        int[]arr = {5,4,6,8,9};
        int[]result = findMinMax(arr);
        System.out.println("Maximum value = " +result[0]);
        System.out.println("Index of Maximum = "+result[1]);
        System.out.println("Minimum Value = " +result[2]);
        System.out.println("Index of Minimum ="+result[3]);
    }
}
