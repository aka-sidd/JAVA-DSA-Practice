package RecursionBootCamp;
import java.util.Scanner;
public class RemoveOccurences {
    static String remove(String s,int idx){
        //base case
        if(idx==s.length()) return "";
        //recursive work
        String SmallAns = remove(s,idx+1);
        char CurrChar = s.charAt(idx);
        //self work
        if(CurrChar!='a') {
            return CurrChar + SmallAns;
        }else{
            return SmallAns;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remove(s,0));
    }
}
