package DSAJava.Stacks.basics;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        BalancedBrackets obj = new BalancedBrackets();
        String s = "{[()]}";
        if(obj.isBalanced(s)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
    public boolean isBalanced(String s){
        Stack<Character>st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{ //closing brackets
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(SameStyle(top,ch))st.pop();
                else return false;

            }

        }
        return (st.size()==0);
    }
    static boolean SameStyle(char top,char ch){
        if(top=='(' && ch ==')')return true;
        if(top=='[' && ch ==']')return true;
        if(top=='{' && ch =='}')return true;
        return false;
    }
}
