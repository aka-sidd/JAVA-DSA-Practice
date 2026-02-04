package DSAJava.String.HappyPrefix;

public class LongestHappyPrefix {

        public static String longestPrefix(String s) {
            int n = s.length();
            int[] lps = new int[n];

            int len = 0;
            int i = 1;

            while (i < n) {
                if (s.charAt(i) == s.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }

            return s.substring(0, lps[n - 1]);
        }

        public static void main(String[] args) {
            test("ababab");
            test("leetcode");
            test("level");
        }

        // Helper method
        private static void test(String s) {
            String result = longestPrefix(s);   // result is defined here
            System.out.println("Input: " + s);
            System.out.println("Output: " + (result.isEmpty() ? "empty" : result));
            System.out.println();
        }
    }
