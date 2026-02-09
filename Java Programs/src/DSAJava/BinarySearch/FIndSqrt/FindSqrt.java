package DSAJava.BinarySearch.FIndSqrt;

public class FindSqrt {
        // Returns floor value of square root of n
        public static int sqrt(int n) {
            if (n < 2) return n;

            int left = 1, right = n / 2;
            int ans = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                long square = (long) mid * mid; // prevent overflow

                if (square == n) {
                    return mid;
                } else if (square < n) {
                    ans = mid;       // store possible answer
                    left = mid + 1;  // move right
                } else {
                    right = mid - 1; // move left
                }
            }

            return ans; // floor sqrt
        }

        // Main method for testing
        public static void main(String[] args) {
            int n = 27;

            int result = sqrt(n);

            System.out.println("Number: " + n);
            System.out.println("Floor square root: " + result);
        }
    }

