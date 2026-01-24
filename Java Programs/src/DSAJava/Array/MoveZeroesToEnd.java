package DSAJava.Array;

public class MoveZeroesToEnd {
   public static void PushZeroesToEnd(int[]arr) {
       int n = arr.length;
       int[] temp = new int[n];
       //To keep track the indexes of temp array
       int j = 0;
       //Copy all non-zero elements from original array to temp
       for (int i = 0; i < n; i++) {
           if (arr[i] != 0)
               temp[j++] = arr[i];
       }
       // Fill the remaining space in temp from 0
       while (j < n)
           temp[j++] = 0;
       //Copy all the elements back from temporary array to original array
       for (int i = 0; i < n; i++) {
           arr[i] = temp[i];
       }
   }
    public static void main(String[] args) {
       int[]arr = {1,2,0,4,0,5,0,7};
       PushZeroesToEnd(arr);

       //Print the modified array
        for(int num:arr){
            System.out.print(num+" ");
        }

    }

   }


