package DSAJava.String.ParanthesesValid;
    import java.util.Stack;

    public class MakeParenthesesValid {

        // =========================
        // BRUTE FORCE APPROACH
        // =========================
        // Time: O(N)
        // Space: O(N)
        public static int minAddBrute(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
            return stack.size();
        }

        // =========================
        // BETTER APPROACH
        // =========================
        // Time: O(N)
        // Space: O(1)
        public static int minAddBetter(String s) {
            int open = 0;
            int close = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    open++;
                } else {
                    if (open > 0) {
                        open--;
                    } else {
                        close++;
                    }
                }
            }
            return open + close;
        }

        // =========================
        // OPTIMAL APPROACH
        // =========================
        // Time: O(N)
        // Space: O(1)
        public static int minAddOptimal(String s) {
            int balance = 0;
            int add = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    balance++;
                } else {
                    if (balance > 0) {
                        balance--;
                    } else {
                        add++;
                    }
                }
            }
            return add + balance;
        }

        // =========================
        // MAIN METHOD
        // =========================
        public static void main(String[] args) {
            String s = "())";

            System.out.println("Input: " + s);
            System.out.println("Brute Answer: " + minAddBrute(s));
            System.out.println("Better Answer: " + minAddBetter(s));
            System.out.println("Optimal Answer: " + minAddOptimal(s));
        }
    }
