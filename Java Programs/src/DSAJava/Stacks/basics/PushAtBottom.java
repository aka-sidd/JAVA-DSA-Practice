package DSAJava.Stacks.basics;

import java.util.Stack;

public class PushAtBottom {
   public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int ele = 60;
        System.out.println(st);
        pushAtBottom(st,ele);
        System.out.println(st);
        reverseStack(st);
       System.out.println(st);

    }

    private static void reverseStack(Stack<Integer> st) {
       if(st.size()<=1) return;
       int top = st.pop();
       reverseStack(st);
       pushAtBottom(st,top);
    }

    private static void pushAtBottom(Stack<Integer>st,int ele){
        if(st.isEmpty()) {
            st.push(ele);
            return;
        }

            int top = st.pop();
            pushAtBottom(st,ele);
            st.push(top);
        }
    }



