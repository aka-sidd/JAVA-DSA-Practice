package DSAJava.BinarySearch.FrequencyCountOnBS;

public class CountFrequency {

        // Find first occurrence
        public static int firstOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    right = mid - 1; // move left
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }

        // Find last occurrence
        public static int lastOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    left = mid + 1; // move right
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans;
        }

        // Count frequency using first & last occurrence
        public static int countFrequency(int[] arr, int target) {
            int first = firstOccurrence(arr, target);
            if (first == -1) return 0;

            int last = lastOccurrence(arr, target);
            return last - first + 1;
        }

        // Main method
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 4, 4, 5, 7};
            int target = 4;

            int frequency = countFrequency(arr, target);

            System.out.println("Array: [1, 2, 4, 4, 4, 5, 7]");
            System.out.println("Target: " + target);
            System.out.println("Frequency: " + frequency);
        }
    }
