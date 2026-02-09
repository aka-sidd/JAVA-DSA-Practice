package DSAJava.BinarySearch.MinimumInRotatedSortedArray;

public class FindMinInRotatedSorted {

        public static int findMin(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                // Minimum is in right half
                if (arr[mid] > arr[right]) {
                    left = mid + 1;
                }
                // Minimum is in left half including mid
                else {
                    right = mid;
                }
            }

            return arr[left]; // or arr[right]
        }

        // Main method
        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};

            int min = findMin(arr);

            System.out.println("Array: [4, 5, 6, 7, 0, 1, 2]");
            System.out.println("Minimum element: " + min);
        }
    }
