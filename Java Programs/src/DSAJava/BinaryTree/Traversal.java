package DSAJava.BinaryTree;
import java.util.*;
class TraversalBT {
    int val;
    Node left;
    Node right;
    TraversalBT(int val){
        this.val = val;
        left = right = null;
    }
}
public class Traversal {
    public static void main(String[] args) {
        Node a = new Node(1); // root node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        DisplayInorder(a);
        System.out.println();
        DisplayPostOrder(a);
    }
    //Pre-order Traversal
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    //In-order Traversal
    private static void DisplayInorder(Node root){
        if(root==null) return ;
        DisplayInorder(root.left);
        System.out.print(root.val + " ");
        DisplayInorder(root.right);

    }
    //Post-order Traversal
    private static void DisplayPostOrder(Node root){
        if(root==null) return ;
        DisplayPostOrder(root.left);
        DisplayPostOrder(root.right);
        System.out.print(root.val + " ");
    }

}
