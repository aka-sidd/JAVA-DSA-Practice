package DSAJava.Stacks;

import java.util.Stack;

public class COpyStackinSameOrder {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        Stack<Integer> gt = new Stack<>();
        while(!rt.isEmpty()){
            gt.push(rt.pop());
        }
        System.out.println(rt);
        System.out.println(gt);
    }
}
