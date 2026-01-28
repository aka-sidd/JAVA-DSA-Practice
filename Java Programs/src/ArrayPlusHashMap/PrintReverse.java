//Print array in reverse without USing Extra Array

package ArrayPlusHashMap;

public class PrintReverse {
    public static void printReverse(int[]arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        printReverse(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
