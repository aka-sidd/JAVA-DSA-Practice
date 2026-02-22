package RecursionBootCamp;

public class Palindrome {
    public static void main(String[] args) {
     int n = 1213;
     int reversed = ReverseRec(n,0);
     if(n==reversed){
         System.out.println("Palindrome");
     }else{
         System.out.println("Not Palindrome");
     }
    }
    // Recursive function to reverse the number
    static int ReverseRec(int n,int rev){
        //Base case
        if(n==0){
            return rev;
        }
        int digit = n%10;
        //Recursive call
        return ReverseRec(n/10,rev*10+digit);
    }




}
