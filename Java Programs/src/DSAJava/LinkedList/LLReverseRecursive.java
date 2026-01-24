package DSAJava.LinkedList;

public class LLReverseRecursive {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
   static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);
       System.out.print(head.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(10);
        Node e = new Node(12);
        //Linking the list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayreverse(a);
    }
}
