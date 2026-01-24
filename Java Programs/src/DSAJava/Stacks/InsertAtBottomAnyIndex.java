package DSAJava.Stacks;

import java.util.Stack;

public class InsertAtBottomAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //push operation
        st.push(21);
        st.push(1);
        st.push(3);
        st.push(5);
        System.out.println(st);
        int x = 20; // element to be inserted at bottom
        //Reverse original stack into temp
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        //Push x(new element) into temp
        temp.push(x);
            while (!st.isEmpty()) {
                st.push(temp.pop());
            }
            System.out.println(st);

        }

    }
