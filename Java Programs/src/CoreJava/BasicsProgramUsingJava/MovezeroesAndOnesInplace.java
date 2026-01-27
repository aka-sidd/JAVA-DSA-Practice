package CoreJava.BasicsProgramUsingJava;

public class MovezeroesAndOnesInplace {
    static void swap(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void sortZeroesAndOnes(int[]arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 0 && arr[right] == 1) {
                swap(arr, left, right);
                left++;
                right--;

            }
            if (arr[left] == 1) left++;

            if (arr[right] == 0) right--;
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,0,1,1,0,0,1,1,0};
        sortZeroesAndOnes(arr);

        //Print the modified array
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    }
