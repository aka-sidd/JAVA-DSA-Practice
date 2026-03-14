package DSAJava.LinkedList_Practice2k26.ReverseLL;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

}
public class ReverseLinkedList {
    //Function to reverse the linkedlist
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    // function to print the list
    public static void PrintList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.val +" ");
              temp = temp.next;
        }
    }
    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        PrintList(head);

        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        PrintList(head);
    }
}
