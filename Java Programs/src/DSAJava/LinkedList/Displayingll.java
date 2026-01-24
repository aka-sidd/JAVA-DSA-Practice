package DSAJava.LinkedList;

public class Displayingll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); //head Node
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); //Tail Node

        //Linking the List
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //Printing the list (Both for and while loop)..
        Node temp = a;
        for(int i=0;i<=4;i++){
//        while(temp!=null){ //printing the list
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
