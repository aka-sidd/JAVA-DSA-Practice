package DSAJava.LinkedList_Practice2k26;
class Linkedlist {
    Node head;
    Node tail;
    int size = 0;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail= temp;
        else{
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    public void addAtHead(int val){
        if(head==null) return;
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }
    public void insertAtPos(int val,int idx) {
        Node newNode = new Node(val);
        // case-1> Insert At Beginning
        if(idx==1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        //Traverse to idx-1
        for(int i=1;i<idx && temp!=null;i++){
            temp = temp.next;
        }
        //position invalid
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        // Insert Node
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }

    public void display() {
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.display();
        ll.addAtTail(70);  ll.display();
        ll.addAtTail(10);  ll.display();
        ll.addAtTail(20);  ll.display();
        ll.addAtTail(30);  ll.display();
        ll.addAtTail(40);  ll.display();
        ll.addAtHead(50);  ll.display();
        ll.addAtHead(100);  ll.display();
        ll.deleteAtHead();      ll.display();
        ll.insertAtPos(45,3); ll.display();
        ll.delete(4);      ll.display();
    }
}
