package DSAJava.Array;
import java.util.*;
public class SortZeroesAndOnes {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Alternate Approach
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void SortZeroesOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }


//    static void SortZeroesOnes(int[]arr){
//        int n = arr.length;
//        int zeroes = 0;
//        // Count the number of zeroes
//        for(int i = 0;i<n;i++) {
//            if (arr[i] == 0) {
//                zeroes++;
//                // 0 to zeroes-1; zeroes to n-1;
//            }
//        }
//            for(int i=0;i<n;i++){
//                if(i<zeroes){
//                    arr[i] = 0;
//                }else{
//                    arr[i] = 1;
//
//            }
//
//            }
//       }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter DSAJava.Array Size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter " + n + " Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Unsorted DSAJava.Array");
            PrintArray(arr);
            System.out.println();
            SortZeroesOnes(arr);
            System.out.println("Sorted DSAJava.Array: ");
            PrintArray(arr);
        }
    }


