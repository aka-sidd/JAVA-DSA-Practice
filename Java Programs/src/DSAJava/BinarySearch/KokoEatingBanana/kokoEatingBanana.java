package DSAJava.BinarySearch.KokoEatingBanana;

public class kokoEatingBanana {

        // Check if Koko can finish with given speed
        private static boolean canFinish(int[] piles, int h, int speed) {
            int hours = 0;

            for (int bananas : piles) {
                // ceil division → (bananas + speed - 1) / speed
                hours += (bananas + speed - 1) / speed;

                if (hours > h) return false;
            }

            return true;
        }

        // Binary search on answer (speed)
        public static int minEatingSpeed(int[] piles, int h) {
            int left = 1;
            int right = 0;

            // max pile value as upper bound
            for (int bananas : piles) {
                right = Math.max(right, bananas);
            }

            int answer = right;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (canFinish(piles, h, mid)) {
                    answer = mid;
                    right = mid - 1; // try smaller speed
                } else {
                    left = mid + 1;  // need faster speed
                }
            }

            return answer;
        }

        // Main method
        public static void main(String[] args) {
            int[] piles = {3, 6, 7, 11};
            int h = 8;

            int speed = minEatingSpeed(piles, h);

            System.out.println("Minimum eating speed: " + speed);
        }
    }

