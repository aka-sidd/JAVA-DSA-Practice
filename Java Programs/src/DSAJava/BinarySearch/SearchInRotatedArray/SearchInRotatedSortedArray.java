package DSAJava.BinarySearch.SearchInRotatedArray;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr, int target) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Target found
                if (arr[mid] == target) {
                    return mid;
                }

                // Left half is sorted
                if (arr[left] <= arr[mid]) {
                    if (target >= arr[left] && target < arr[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                // Right half is sorted
                else {
                    if (target > arr[mid] && target <= arr[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1; // Not found
        }

        // Main method
        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;

            int index = search(arr, target);

            System.out.println("Array: [4, 5, 6, 7, 0, 1, 2]");
            System.out.println("Target: " + target);
            System.out.println("Found at index: " + index);
        }
    }

