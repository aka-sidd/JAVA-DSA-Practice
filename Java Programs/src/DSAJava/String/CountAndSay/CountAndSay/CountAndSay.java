package DSAJava.String.CountAndSay.CountAndSay;

public class CountAndSay {
        // =========================
        // BRUTE FORCE APPROACH
        // =========================
        // Idea: Har iteration me string ko manually scan karke nayi string banao
        // Time: O(N * L)
        // Space: O(L)
        public static String countAndSayBrute(int n) {
            String result = "1";

            for (int i = 2; i <= n; i++) {
                String next = "";
                int count = 1;

                for (int j = 1; j < result.length(); j++) {
                    if (result.charAt(j) == result.charAt(j - 1)) {
                        count++;
                    } else {
                        next += count + "" + result.charAt(j - 1);
                        count = 1;
                    }
                }
                next += count + "" + result.charAt(result.length() - 1);
                result = next;
            }
            return result;
        }

        // =========================
        // BETTER APPROACH
        // =========================
        // Idea: Same logic but using StringBuilder (faster than string concatenation)
        // Time: O(N * L)
        // Space: O(L)
        public static String countAndSayBetter(int n) {
            String result = "1";

            for (int i = 2; i <= n; i++) {
                StringBuilder sb = new StringBuilder();
                int count = 1;

                for (int j = 1; j < result.length(); j++) {
                    if (result.charAt(j) == result.charAt(j - 1)) {
                        count++;
                    } else {
                        sb.append(count);
                        sb.append(result.charAt(j - 1));
                        count = 1;
                    }
                }
                sb.append(count);
                sb.append(result.charAt(result.length() - 1));
                result = sb.toString();
            }
            return result;
        }

        // =========================
        // OPTIMAL APPROACH
        // =========================
        // Idea: Two pointer technique for reading groups
        // Time: O(N * L)
        // Space: O(L)
        public static String countAndSayOptimal(int n) {
            String result = "1";

            for (int i = 2; i <= n; i++) {
                StringBuilder sb = new StringBuilder();
                int index = 0;

                while (index < result.length()) {
                    char currentChar = result.charAt(index);
                    int count = 0;

                    while (index < result.length() && result.charAt(index) == currentChar) {
                        count++;
                        index++;
                    }

                    sb.append(count);
                    sb.append(currentChar);
                }
                result = sb.toString();
            }
            return result;
        }

        // =========================
        // MAIN METHOD
        // =========================
        public static void main(String[] args) {
            int n = 5;

            System.out.println("Input: " + n);
            System.out.println("Brute Answer: " + countAndSayBrute(n));
            System.out.println("Better Answer: " + countAndSayBetter(n));
            System.out.println("Optimal Answer: " + countAndSayOptimal(n));
        }
    }

