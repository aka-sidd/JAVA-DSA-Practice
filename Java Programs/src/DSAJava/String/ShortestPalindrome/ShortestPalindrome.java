package DSAJava.String.ShortestPalindrome;

public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) return s;

        // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();

        // Combine for KMP processing
        String temp = s + "#" + rev;

        // Build LPS array
        int[] lps = buildLPS(temp);

        // Length of longest palindromic prefix
        int palLen = lps[temp.length() - 1];

        // Remaining suffix to be added in front
        String suffix = s.substring(palLen);

        // Reverse suffix and prepend
        return new StringBuilder(suffix).reverse().toString() + s;
    }

    // Build LPS array for KMP
    private static int[] buildLPS(String pat) {
        int[] lps = new int[pat.length()];
        int len = 0;
        int i = 1;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
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
        return lps;
    }

    // Driver code for IDE testing
    public static void main(String[] args) {
        test("aacecaaa");
        test("abcd");
        test("race");
    }

    private static void test(String s) {
        System.out.println("Input: " + s);
        System.out.println("Output: " + shortestPalindrome(s));
        System.out.println();
    }
}

