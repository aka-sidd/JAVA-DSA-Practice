package DSAJava.LinkedList;

public class DeleteAtEnd{
    public static class Linkedlist {
        Node head;
        Node tail;
        int size;

        public class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        void deleteAt(int idx) {
            if(idx<1 || idx>size){
                System.out.println("Index out of Bound");
                return;
            }
            if(idx==1){
                head = head.next;
                if(head==null){
                    tail = null;
                }
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            if (temp.next == tail) {
                tail = temp; // last node delete ho rhi..
            }
            temp.next = temp.next.next;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(7);

        ll.display();
        System.out.println();

        ll.deleteAt(1);
        ll.display();
        System.out.println(ll.tail.data+" ");

    }

}
