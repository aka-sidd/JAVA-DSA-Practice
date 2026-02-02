package DSAJava.String.LongestCommonPrefix;

public class LongestCommonPrefix {
        // -------------------------
        // Brute Force
        // -------------------------
        static String brute(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);

                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }

        // -------------------------
        // Better
        // -------------------------
        static String better(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            String smallest = strs[0];
            for (String s : strs) {
                if (s.length() < smallest.length()) {
                    smallest = s;
                }
            }

            for (int i = 0; i < smallest.length(); i++) {
                char ch = smallest.charAt(i);

                for (String s : strs) {
                    if (s.charAt(i) != ch) {
                        return smallest.substring(0, i);
                    }
                }
            }
            return smallest;
        }

        // -------------------------
        // Optimal
        // -------------------------
        static String optimal(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            java.util.Arrays.sort(strs);

            String first = strs[0];
            String last = strs[strs.length - 1];

            int i = 0;
            while (i < first.length() && i < last.length()
                    && first.charAt(i) == last.charAt(i)) {
                i++;
            }

            return first.substring(0, i);
        }

        // -------------------------
        // Testing (Print EMPTY if no common prefix)
        // -------------------------
        public static void main(String[] args) {
            String[] input1 = {"flower", "flow", "flight"};
            String[] input2 = {"dog", "racecar", "car"};

            test(input1);
            System.out.println();
            test(input2);
        }

        static void test(String[] input) {
            System.out.println("Input: " + java.util.Arrays.toString(input));

            String a = brute(input);
            String b = better(input);
            String c = optimal(input);

            System.out.println("Brute:   " + (a.isEmpty() ? "EMPTY" : a));
            System.out.println("Better:  " + (b.isEmpty() ? "EMPTY" : b));
            System.out.println("Optimal: " + (c.isEmpty() ? "EMPTY" : c));
        }
    }





