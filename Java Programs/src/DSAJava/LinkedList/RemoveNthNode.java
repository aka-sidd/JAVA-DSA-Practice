package DSAJava.LinkedList;

public class RemoveNthNode {
    public static Node deleteNthNode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null){
            assert head != null;
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
   public static class Node{
     int data;
     Node next;
       Node(int data){
           this.data = data;
       }
   }
   public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       System.out.println();
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
        e.next = f;

        display(a);
      a = deleteNthNode(a,6);
        display(a);

    }
}
