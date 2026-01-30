package StringPlusHashMap.CheckPalindrome;
//This is Brute force
public class CheckPalindrome {
    public static boolean isPalindromeBrute(String s){
        int n = s.length();
        String rev = "";
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return s.equals(rev);
    }
    //This is a Better Approach
    public static boolean isPalindromeBetter(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return s.equals(sb.toString());
    }
    public static boolean isPalindromeOptimal(String s){
        int n = s.length();
        int left = 0,right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println("brute: "+ isPalindromeBrute(s));
        System.out.println("Better: " +isPalindromeBetter(s));
        System.out.println("Optimal: " +isPalindromeOptimal(s));


    }
}
