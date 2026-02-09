package DSAJava.BinarySearch.UpperAndLowerBound;

public class ImplementUpperAndLowerBound {
    /**
     * Description: Implements Lower Bound and Upper Bound using Binary Search.
     * Author: Siddharth Pandey
     */

        public static int lowerBound(int[] arr, int target) {
            int left = 0;
            int right = arr.length; // important: not length-1

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

        /**
         * Upper Bound:
         * Returns the first index where value > target.
         * If not found, returns array length.
         */
        public static int upperBound(int[] arr, int target) {
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

        /**
         * Main method for testing.
         */
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 4, 4, 5, 7};

            int target = 4;

            int lb = lowerBound(arr, target);
            int ub = upperBound(arr, target);

            System.out.println("Array: [1, 2, 4, 4, 4, 5, 7]");
            System.out.println("Target: " + target);
            System.out.println("Lower Bound index: " + lb);
            System.out.println("Upper Bound index: " + ub);
        }
    }

