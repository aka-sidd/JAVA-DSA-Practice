package DSAJava.Stacks;

public class LLImplementation {
    public static class Node{ //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }
    public static class LLStack{ //user defined data structure
        Node head = null;
        int size = 0;
        //Insert krna
        void push(int x){
            Node temp = new Node(x);
            temp.next = null;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(19);
    }
}
