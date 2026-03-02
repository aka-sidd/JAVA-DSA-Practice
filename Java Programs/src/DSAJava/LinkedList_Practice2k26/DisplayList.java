package DSAJava.LinkedList_Practice2k26;

import java.util.Scanner;

public class DisplayList {
public static void display(Node head){
  Node temp = head;
  while(temp!=null){
      System.out.print(temp.val+" ");
      temp = temp.next;
  }
   // for(Node temp = head;temp!=null;temp = temp.next){
    //    System.out.println(temp.val+" ");
    System.out.println();
}
public static void displayRec(Node head){
    if(head==null) return;

    displayRec(head.next);
    System.out.print(head.val+" ");
}
private static int get(Node head,int idx){
    Node temp = head;
    for(int i=0;i<idx;i++){
        temp = temp.next;
    }
    return temp.val;

}
    public static void main(String[] args) {
    //user input
       // Scanner sc = new Scanner(System.in);
       // Node a = new Node(sc.nextInt()); // head node
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //connect
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      // display(a);
        displayRec(a);
        System.out.println();
        System.out.println(get(a,3));

    }
}
