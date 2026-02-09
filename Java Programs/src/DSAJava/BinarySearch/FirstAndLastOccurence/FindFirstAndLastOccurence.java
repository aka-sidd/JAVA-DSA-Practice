package DSAJava.BinarySearch.FirstAndLastOccurence;

public class FindFirstAndLastOccurence {
    /**
     * File: FirstLastOccurrence.java
     * Description: Find first and last occurrence of an element in a sorted array using Binary Search.
     * Author: Siddharth Pandey
     */

        // Find first occurrence (leftmost index)
        public static int firstOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    ans = mid;        // store answer
                    right = mid - 1;  // move left to find earlier occurrence
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }

        // Find last occurrence (rightmost index)
        public static int lastOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    ans = mid;       // store answer
                    left = mid + 1;  // move right to find later occurrence
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }

        // Main method for testing
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 4, 4, 5, 7};
            int target = 4;

            int first = firstOccurrence(arr, target);
            int last = lastOccurrence(arr, target);

            System.out.println("Array: [1, 2, 4, 4, 4, 5, 7]");
            System.out.println("Target: " + target);
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }
    }
