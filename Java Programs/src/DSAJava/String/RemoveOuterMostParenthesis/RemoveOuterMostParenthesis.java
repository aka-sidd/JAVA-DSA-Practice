package DSAJava.String.RemoveOuterMostParenthesis;

public class RemoveOuterMostParenthesis {

        // =========================
        // BRUTE FORCE APPROACH
        // =========================
        public static String removeOuterBrute(String s) {
            String result = "";
            int balance = 0;
            String temp = "";

            for (char ch : s.toCharArray()) {
                temp += ch;

                if (ch == '(') balance++;
                else balance--;

                // Jab ek primitive string complete ho jaye
                if (balance == 0) {
                    // Remove first and last bracket
                    result += temp.substring(1, temp.length() - 1);
                    temp = "";
                }
            }
            return result;
        }

        // =========================
        // BETTER APPROACH
        // =========================
        public static String removeOuterBetter(String s) {
            String result = "";
            int balance = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    if (balance > 0) {
                        result += ch;
                    }
                    balance++;
                } else {
                    balance--;
                    if (balance > 0) {
                        result += ch;
                    }
                }
            }
            return result;
        }

        // =========================
        // OPTIMAL APPROACH
        // =========================
        public static String removeOuterOptimal(String s) {
            StringBuilder result = new StringBuilder();
            int balance = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    if (balance != 0) {
                        result.append(ch);
                    }
                    balance++;
                } else {
                    balance--;
                    if (balance != 0) {
                        result.append(ch);
                    }
                }
            }
            return result.toString();
        }

        // =========================
        // MAIN METHOD (Testing)
        // =========================
        public static void main(String[] args) {
            String input = "(()())(())(()(()))";

            System.out.println("Input: " + input);

            System.out.println("Brute Output:   " + removeOuterBrute(input));
            System.out.println("Better Output:  " + removeOuterBetter(input));
            System.out.println("Optimal Output: " + removeOuterOptimal(input));
        }
    }

