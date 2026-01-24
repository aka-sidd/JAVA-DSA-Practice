package DSAJava.LinkedList;

public class InsertioninDLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head) {
        Node t = new Node(30);
        t.next = head;
        t.prev = null;

        if (head != null) {
            head.prev = t;
        }
            head = t;
            return head;
        }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(14);
        Node e = new Node(77);

        //Linking the list
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        Node head = a;
        head = insertAtHead(head);
        display(head);
    }


}
