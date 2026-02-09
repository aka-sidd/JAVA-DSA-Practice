package DSAJava.BinarySearch.PeakElement;

public class FindPeakElement {

        public static int findPeak(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                // If mid element is smaller than next, peak lies on right
                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                }
                // Otherwise, peak lies on left including mid
                else {
                    right = mid;
                }
            }

            return left; // index of peak element
        }

        // Main method for testing
        public static void main(String[] args) {
            int[] arr = {1, 3, 20, 4, 1, 0};

            int peakIndex = findPeak(arr);

            System.out.println("Array: [1, 3, 20, 4, 1, 0]");
            System.out.println("Peak element index: " + peakIndex);
            System.out.println("Peak element value: " + arr[peakIndex]);
        }
    }