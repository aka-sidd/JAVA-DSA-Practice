package DSAJava.LinkedList;

public class FindMiddle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        //For even number of nodes...
        while (fast.next!= null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        //Creating the list
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        head.next.next.next.next= new Node(10);
        head.next.next.next.next.next= new Node(12);
        Node middle = findMiddle(head);
        System.out.println("Middle element is:" +middle.data);
    }
}
