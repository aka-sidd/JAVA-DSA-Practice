package StringPlusHashMap.ReverseString;

public class ReverseString {

    // Method 1 - Brute Force
    public static String reverseBrute(String s) {
        String rev = "";
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    // Method 2 - Better (Using StringBuilder)
    public static String reverseBetter(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    // Method 3 - Optimal (Two Pointer)
    public static String reverseOptimal(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // Driver Code
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("Brute: " + reverseBrute(s));
        System.out.println("Better: " + reverseBetter(s));
        System.out.println("Optimal: " + reverseOptimal(s));
    }
}
