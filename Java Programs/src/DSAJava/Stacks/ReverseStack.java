package DSAJava.Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        System.out.println(st);
        //reverse to the stack for using two extra stack...
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while (!rt.isEmpty()) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
            while (!gt.isEmpty()) {
                st.push(gt.pop());
            }
        System.out.println(st);
        }
    }

