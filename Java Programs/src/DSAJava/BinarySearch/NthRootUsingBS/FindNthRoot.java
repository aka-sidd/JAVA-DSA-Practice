package DSAJava.BinarySearch.NthRootUsingBS;

public class FindNthRoot {

        // Function to multiply mid n times and compare with m
        private static long power(long base, int n, long limit) {
            long result = 1;

            for (int i = 0; i < n; i++) {
                result *= base;

                if (result > limit) return result; // stop early to avoid overflow
            }

            return result;
        }

        // Returns integer nth root if exists, otherwise -1
        public static int nthRoot(int n, int m) {
            int left = 1, right = m;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                long value = power(mid, n, m);

                if (value == m) {
                    return mid; // exact root found
                } else if (value < m) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1; // no integer root exists
        }

        // Main method for testing
        public static void main(String[] args) {
            int n = 3; // cube root
            int m = 27;

            int result = nthRoot(n, m);

            System.out.println("n: " + n + ", m: " + m);
            System.out.println("Nth root: " + result);
        }
    }
