package DSAJava.Array;

import java.util.*;
public class FindElement {
    public static int FindArrayElement(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size=0;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = FindArrayElement(arr, x);
        System.out.println(result);
    }
}
