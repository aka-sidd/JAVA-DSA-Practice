package ArrayPlusHashMap;

public class SecondLargest{
    static int[] secondlargest(int[]arr){
        int n = arr.length;
        int largest = arr[0];
        int secondlargest = arr[0];
        int largestIndex = -1;
        int  secondlargestIndex = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                secondlargestIndex = largestIndex;
                largest = arr[i];
                largestIndex = i;
            } else if (arr[i]>secondlargest&&arr[i]!=largest) {
                secondlargest = arr[i];
                secondlargestIndex = i;
            }
        }
        return new int[]{largest, largestIndex,secondlargest,secondlargestIndex};
    }
    public static void main(String[] args) {
        int[]arr = {10,20,5,8,20,15};
        int[]result = secondlargest(arr);
        System.out.println("Largest Element is: "+result[0] + "| Index = "+result[1]);
        System.out.println("SecondLargest Element is: "+result[2] +" | Index = " +result[3]);
    }
}
