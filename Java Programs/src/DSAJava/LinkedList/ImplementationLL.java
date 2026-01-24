package DSAJava.LinkedList;

public class ImplementationLL {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        //Insert At End element
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;

            }
            tail = temp;
            size++;


        }

        //Insert At Beginning
        void InsertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) { //empty list k case mein
                head = tail = temp;
            } else { //non-empty list
                temp.next = head;
                head = temp;
                size++;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                InsertAtHead(val);
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;


        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
//        void deleteAt(int idx){
//            Node temp = head;
//            for(int i=1;i<idx-1;i++){
//                temp = temp.next;
//            }
//            if(temp.next==null){
//                System.out.println("Index out of bound");
//            }
//            temp.next = temp.next.next;
//            size--;
    }


        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(4); //
            ll.insertAtEnd(5); // 4->5

//            ll.deleteAt(4);

//            System.out.println();
//            System.out.println("Size:" +ll.size);
//            ll.insertAtEnd(12); //4->5->12
//            ll.display();
//            ll.insertAtEnd(15);  // 4->5->12->15
//            ll.display();
//            System.out.println("Size:" +ll.size);
//            ll.InsertAtHead(1); // 1->4->5->12->15
//            ll.display();
//            System.out.println();
//            ll.insertAt(4,10);
//            ll.display();
//            System.out.println();
//            ll.insertAt(0,100);
//            ll.display();
//            System.out.println();
//            System.out.println("value of idx:"+ll.getAt(3));
           // System.out.println("tail: "+ll.tail.data);

        }
    }

