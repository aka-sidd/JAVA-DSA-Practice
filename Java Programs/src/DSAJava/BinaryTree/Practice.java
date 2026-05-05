package DSAJava.BinaryTree;
class practice{
    int val;
    Node left;
    Node right;
    practice(int val){
        this.val = val;
    }
}
public class Practice {
    public static void main(String[] args) {
        //      3
        //    /
        //   4    5
        //  / \   / \
        // 6  7   12 11
        // /       /
        // 9 8     13 14

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(9);
        Node g = new Node(8);
        Node h = new Node(12);
        Node i = new Node(11);
        Node j = new Node(13);
        Node k = new Node(14);

        a.left = b;
        b.left = d; b.right = e;
        c.left = h; c.right = i;
        d.left = f;
        display(a);
        System.out.println("Size of Binary tree is:" + size(a));


    }
    private static void display(Node root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
    private static int size(Node root){
        if(root==null) return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize;
    }

    }

