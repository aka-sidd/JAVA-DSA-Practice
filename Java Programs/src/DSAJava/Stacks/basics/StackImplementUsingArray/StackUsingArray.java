package DSAJava.Stacks.basics.StackImplementUsingArray;

class MyStacks {
    private final int[]arr;
    private final int capacity;
    private int top;
    //constructor
    public MyStacks(int cap){
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }
    //push operation
    public void push(int x){
        if(top==capacity-1){
            System.out.println("Stack Overflow!!");
            return;
        }
        arr[++top] = x;
    }
    //pop operation
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        return arr[top--];
    }
    //peek operation
    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[top];
    }
    // check is stack is Empty
    public boolean isEmpty(){
        return top == -1;
    }
    // check if stack is full
    public boolean isFull(){
        return top == capacity-1;
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        MyStacks st = new MyStacks(4);
        //pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //popping one element
        System.out.println("Popped: " + st.pop());
        //checking top element
        System.out.println("Top Element: " + st.peek());
        //checking if stack is empty
        System.out.println("Is Stack Empty: " + (st.isEmpty() ? "Yes" : "No"));
        //checking if stack is full
        System.out.println("Is Stack Full: " + (st.isFull() ? "Yes" : "No"));

    }
}
