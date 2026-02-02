package DSAJava.String.LargestOddNumber;

public class LargestOddNumber {
        // -------------------------
        // Brute Force
        // -------------------------
        static String brute(String num) {
            for (int i = num.length(); i > 0; i--) {
                String part = num.substring(0, i);
                int lastDigit = part.charAt(part.length() - 1) - '0';

                if (lastDigit % 2 == 1) {
                    return part;
                }
            }
            return "";
        }

        // -------------------------
        // Better
        // -------------------------
        static String better(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                int digit = num.charAt(i) - '0';

                if (digit % 2 == 1) {
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }

        // -------------------------
        // Optimal
        // -------------------------
        static String optimal(String num) {
            // Same as better, just cleaner naming
            for (int i = num.length() - 1; i >= 0; i--) {
                char ch = num.charAt(i);

                if ((ch - '0') % 2 != 0) {
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }

        // -------------------------
        // Testing
        // -------------------------
        public static void main(String[] args) {
            test("35427");
            System.out.println();
            test("4206");
        }

        static void test(String input) {
            System.out.println("Input: " + input);

            String a = brute(input);
            String b = better(input);
            String c = optimal(input);

            System.out.println("Brute:   " + (a.isEmpty() ? "EMPTY" : a));
            System.out.println("Better:  " + (b.isEmpty() ? "EMPTY" : b));
            System.out.println("Optimal: " + (c.isEmpty() ? "EMPTY" : c));
        }
    }

