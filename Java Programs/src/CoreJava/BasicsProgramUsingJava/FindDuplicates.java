package CoreJava.BasicsProgramUsingJava;

import java.util.Arrays;
public class FindDuplicates {
    public static void findDuplicate(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Duplicate Elements");
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5, 8};
        findDuplicate(arr);
    }
}