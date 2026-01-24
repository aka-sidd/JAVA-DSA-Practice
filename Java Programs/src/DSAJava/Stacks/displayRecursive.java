package DSAJava.Stacks;

import java.util.Stack;

public class displayRecursive {
    static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return; //Base Case
        int top = st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(3);
        st.push(9);
        displayRec(st);
        System.out.println();
        System.out.println(st);
    }
}
