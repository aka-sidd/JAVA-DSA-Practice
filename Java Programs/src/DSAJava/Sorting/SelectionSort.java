package DSAJava.Sorting;

public class SelectionSort {
    static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //i represent the current index
            int min_index = i;
            for(int j= i+1;j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            // swap the elements from j to min_index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    static void PrintArray(int[]arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      int[]arr = {7,6,5,4,3,2};
        System.out.println("Original DSAJava.Array");
        PrintArray(arr);

        selectionSort(arr);

        System.out.println("Sorted DSAJava.Array");
        PrintArray(arr);
    }
}
