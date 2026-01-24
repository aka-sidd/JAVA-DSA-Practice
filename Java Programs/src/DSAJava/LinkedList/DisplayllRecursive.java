package DSAJava.LinkedList;

public class DisplayllRecursive {
    public static void displayr(Node head){
        if(head==null) return;
        displayr(head.next);
        System.out.print(head.data+" ");

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);

        //Linking the list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //Call the function
        displayr(a);
    }
}
