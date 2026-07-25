package DSAJava.Array.MajorityElement;
import java.util.*;
public class MajorityElementOptimal {
    public static int Majority_ElementOptimal(int[] arr) {
        int n = arr.length;
        int candiate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candiate = num;
            }
            if (num == candiate) {
                count++;
            } else {
                count--;
            }
        }
        return candiate;// if qs gives guarenteed u that majority element is exist..
        // if not than one verification is needed...
    }
    static int MajorityElementsOptimal(int[]arr) {
        int n = arr.length;
        int candidate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        //verification
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > n / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {2,2,1,1,1,2,2};
        System.out.println(Majority_ElementOptimal(arr));
        System.out.println(MajorityElementsOptimal(arr));
    }
    }


