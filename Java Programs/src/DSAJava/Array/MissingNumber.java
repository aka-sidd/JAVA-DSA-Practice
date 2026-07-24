package DSAJava.Array;
import java.util.*;
public class MissingNumber {
    public static int missingNumber(int[] arr, int N) {
        for (int num = 1; num <= N; num++) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return num;
            }
        }
        return -1;
    }


// Optimal solution..

    public static int MissingOptimal(int[] arr, int N) {
        boolean[] present = new boolean[N + 1];
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }
        //find missing number
        for (int i = 1; i <= N; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1;
    }
}
