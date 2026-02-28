package RecursionBootCamp;
import java.util.*;
public class StringReverse {
    static String reverse(String s ,int idx){
        //base case
        if(idx==s.length()){
            return "";
        }
        //recursive work
        String smallAns = reverse(s,idx+1);
        //self work
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
        String rev = reverse(s,0);
        if(rev.equals(s)){
            System.out.printf("%s is Palindrome",s);
        }else{
            System.out.printf("%s is Not Palindrome",s);
        }



    }
}
