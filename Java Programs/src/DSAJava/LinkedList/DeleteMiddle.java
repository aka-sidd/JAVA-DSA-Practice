package DSAJava.LinkedList;
public class DeleteMiddle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteMiddle(Node head) {
        if (head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        //Creating the DSAJava.LinkedList
        Node head = new Node(100);
        head.next = new Node(5);
        head.next.next = new Node(80);
        head.next.next.next = new Node(50);

        Node middle = deleteMiddle(head);
        while (middle != null) {
            System.out.print(middle.data + " ");
            middle = middle.next;
        }
    }
}
