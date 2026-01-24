package DSAJava.LinkedList;

public class NthNodeFromEnd {
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        //nth Node from start
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    //2nd technique which is asked in interviews and here in this
    //method I take 2 pointers namely slow and fast pointers and applying
    //loop and from 1 to size n tk and then fast pointers ko aage bdha denge
    //uske size tk then while loop lgayenge aur condition check krenge
    //ki fast jb tk null nhi ho jaata tb slow aur fast pointers ko ek ek
    //step aage badhate rhenge...
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);
        //Linking the list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next =f;
        Node q = nthNode2(a,2);
        System.out.println(q.data);
    }
}
