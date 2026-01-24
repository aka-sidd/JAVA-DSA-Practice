package DSAJava.LinkedList;

public class RemoveDuplicate {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node removedupicates(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        RemoveDuplicate ll = new RemoveDuplicate();
        Node a = new Node(12);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(15);
        //linking the list...
        a.next = b;
        b.next = c;
        c.next = d;

        Node head = a;
        head = removedupicates(head);
       ll.display(a);

    }
}
