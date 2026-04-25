package DSAJava.Stacks.basics.StackImplementUsingArray;
import java.util.*;
class MyStack{
    ArrayList<Integer> arr = new ArrayList<>();
    //push operation
    void push(int x){
        arr.add(x);

    }
    //pop operation
    int pop(){
        if(arr.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr.getLast();
        arr.removeLast();
        return val;
    }
    //peek operation
    int peek(){
        if(arr.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr.getLast();
    }
    //check is stack is empty
    boolean isEmpty(){
        return arr.isEmpty();
    }
    //current size
    int size(){
        return arr.size();
    }
}
public class StackUsingDynamicArray {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        //pushing element
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //popping one element
        System.out.println("Popped: " +st.pop());
        //checking top element
        System.out.println("Top Element: "+st.peek());
        //checking is stack is empty
        System.out.println("Is Stack Empty: " +(st.isEmpty() ? "Yes" : "No"));
        //checking current size
        System.out.println("Current size: " +st.size());
    }
}
