package DSAJava.BinarySearch.MinimumDaystoMakeBouquets;

public class FIndMinDaytoMakeBouquet {

        // Check if possible to make m bouquets in given days
        private static boolean canMake(int[] bloomDay, int m, int k, int days) {
            int bouquets = 0;
            int flowers = 0;

            for (int bloom : bloomDay) {
                if (bloom <= days) {
                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0; // reset if flower not bloomed
                }

                if (bouquets >= m) return true;
            }

            return false;
        }

        // Binary search on minimum days
        public static int minDays(int[] bloomDay, int m, int k) {
            long totalNeeded = (long) m * k;
            if (totalNeeded > bloomDay.length) return -1;

            int left = Integer.MAX_VALUE;
            int right = Integer.MIN_VALUE;

            for (int day : bloomDay) {
                left = Math.min(left, day);
                right = Math.max(right, day);
            }

            int answer = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (canMake(bloomDay, m, k, mid)) {
                    answer = mid;
                    right = mid - 1; // try smaller days
                } else {
                    left = mid + 1;  // need more days
                }
            }

            return answer;
        }

        // Main method
        public static void main(String[] args) {
            int[] bloomDay = {1, 10, 3, 10, 2};
            int m = 3; // bouquets
            int k = 1; // flowers per bouquet

            int result = minDays(bloomDay, m, k);

            System.out.println("Minimum days to make bouquets: " + result);
        }
    }

