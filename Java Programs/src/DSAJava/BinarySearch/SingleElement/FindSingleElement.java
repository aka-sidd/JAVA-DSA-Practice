package DSAJava.BinarySearch.SingleElement;

public class FindSingleElement {

        public static int singleNonDuplicate(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                // Make mid even to compare with pair start
                if (mid % 2 == 1) {
                    mid--;
                }

                // If pair is correct, single element is on right
                if (arr[mid] == arr[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid;
                }
            }

            return arr[left];
        }

        // Main method for testing
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

            int single = singleNonDuplicate(arr);

            System.out.println("Array: [1, 1, 2, 2, 3, 4, 4, 5, 5]");
            System.out.println("Single non-duplicate element: " + single);
        }
    }

