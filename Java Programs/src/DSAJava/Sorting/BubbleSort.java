package DSAJava.Sorting;

public class BubbleSort {
    static void bubbleSort(int[]arr){
        int n = arr.length;

        // n-1 iterations hame krni hai...
        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                //because last i elements are already sorted
                if(arr[j]>arr[j+1]){
                    //swap -- arr[j] ko arr[j+1]..
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {7,6,5,4,3};
        bubbleSort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
