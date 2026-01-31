package DSAJava.String.FirstNonRepeatingCharacter;

    import java.util.*;

    public class FirstNonRepeating {

        // -------------------------------
        // 1) BRUTE FORCE (Using COUNT, No Flag)
        // Time: O(N^2), Space: O(1)
        // -------------------------------
        public static char firstNonRepeatingBrute(String s) {
            int n = s.length();

            for (int i = 0; i < n; i++) {
                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    return s.charAt(i);
                }
            }

            return '#'; // No non-repeating character found
        }

        // -------------------------------
        // 2) BETTER (Frequency Array)
        // Time: O(N), Space: O(1)
        // -------------------------------
        public static char firstNonRepeatingBetter(String s) {
            int[] freq = new int[26]; // assuming lowercase a-z

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return s.charAt(i);
                }
            }

            return '#';
        }

        // -------------------------------
        // 3) OPTIMAL (LinkedHashMap)
        // Time: O(N), Space: O(N)
        // -------------------------------
        public static char firstNonRepeatingOptimal(String s) {
            Map<Character, Integer> map = new LinkedHashMap<>();

            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return '#';
        }

        // -------------------------------
        // MAIN METHOD FOR TESTING
        // -------------------------------
        public static void main(String[] args) {
            String s = "aabbcde";

            System.out.println("Input String: " + s);

            System.out.println("Brute Force Result: " + firstNonRepeatingBrute(s));
            System.out.println("Better Approach Result: " + firstNonRepeatingBetter(s));
            System.out.println("Optimal Approach Result: " + firstNonRepeatingOptimal(s));
        }
    }

