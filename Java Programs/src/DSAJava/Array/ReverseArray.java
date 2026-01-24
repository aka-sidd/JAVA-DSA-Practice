package DSAJava.Array;

public class ReverseArray {
    static void PrintArr(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int j =0;
        PrintArr(arr);
        int i = 0; j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        PrintArr(arr);
    }

}