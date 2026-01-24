package DSAJava.LinkedList;

public class Basicsll {

    public static class Node{
        int data; // value
        Node next; // agle wale address ka store h...//address
        //of next node
        Node(int data){
            this.data = data;
        }

    }
    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;

        }
        t.next = temp;

    }
      void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       Basicsll list = new Basicsll();
        Node a = new Node(5);
       // System.out.println(a.next); // null
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //5->7->9->8->16
        a.next = b; //5->7
        b.next = c; //5->7->9
        c.next = d; //5->7->9->8
        d.next = e; //5->7->9->8->16
        System.out.println(a.data); // 5
        System.out.println(a.next.next.data);// 9
//        System.out.println(a.next);//DSAJava.LinkedList.Basicsll$Node@6acbcfc0
//        System.out.println(b); // DSAJava.LinkedList.Basicsll$Node@6acbcfc0
//        System.out.println(c); // DSAJava.LinkedList.Basicsll$Node@5f184fc6

        // System.out.println(x.data);
        //System.out.println(a.next);
        insertAtEnd(a,80);
       list.display(a);


    }
}
