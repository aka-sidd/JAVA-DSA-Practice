package DSAJava.String.KMPAlgorithm;

public class KMPAlgorithm {
        // Function to build LPS array
        private static int[] buildLPS(String pattern) {
            int[] lps = new int[pattern.length()];
            int len = 0; // length of previous longest prefix suffix
            int i = 1;

            while (i < pattern.length()) {
                if (pattern.charAt(i) == pattern.charAt(len)) {
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

        // KMP Search function
        public static int search(String text, String pattern) {
            int[] lps = buildLPS(pattern);

            int i = 0; // index for text
            int j = 0; // index for pattern

            while (i < text.length()) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    i++;
                    j++;
                }

                if (j == pattern.length()) {
                    return i - j; // match found
                } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return -1; // no match
        }

        public static void main(String[] args) {
            String text = "ababcabcabababd";
            String pattern = "ababd";

            int index = search(text, pattern);

            if (index != -1) {
                System.out.println("Pattern found at index: " + index);
            } else {
                System.out.println("Pattern not found");
            }
        }
    }
