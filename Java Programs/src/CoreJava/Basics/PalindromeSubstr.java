package CoreJava.Basics;

import java.util.*;
public class PalindromeSubstr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        StringBuilder gtr = new StringBuilder(sc.nextLine());
        gtr.reverse();
        String s = gtr +" ";
        if(s.equals(s)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
