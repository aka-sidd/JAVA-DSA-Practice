package DSAJava.BinaryTree;

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair {
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
public class Implementation {
    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    /\  /\
        //   -1 1 4 6
        Node a = new Node(1); // root node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(4);
        Node g = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println("Size of Binary tree is: " + size(a));
        System.out.println("Sum of All Values of Binary tree is: " + sum(a));
        System.out.println("product of all Values of a Binary tree is: " +findProduct(a));
        System.out.println("Maximum Value of the Binary tree is: " + max(a));
        System.out.println("Levels of a Binary tree is: " + levels(a));
        //levelOrderTraversal(a);
        //levelOrderTraversalLineWise(a);
        KthLevel(a,0,2);

    }
    private static void KthLevel(Node root,int level,int k){
        if(root==null) return;
        if(level==k) System.out.print(root.val+ " ");
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }

//    private static void levelOrderTraversalLineWise(Node root) {
//        Queue<Pair> q = new LinkedList<>();
//        int currLevel = 0;
//        q.add(new Pair(root,0));
//        while(!q.isEmpty()){
//            Pair front = q.poll();
//            if(front.level!=currLevel){
//                currLevel++;
//                System.out.println();
//            }
//            System.out.print(front.node.val + " ");
//            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
//            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
//        }
//    }

    private static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.poll();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int size(Node root){
//        if(root==null) return 0;
//       return 1 + size(root.left)+size(root.right);
//        int leftSize = size(root.left);
//        int rightSize = size(root.right);
//        // add +1 because root node also consider(apart from leftSubtree and rightSubtree)
//        return 1 + leftSize + rightSize;

        return (root==null)? 0 : 1 + size(root.left)+ size(root.right);
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
       display(root.left);
//        System.out.print(root.val+ " ");
        display(root.right);
        //display(root.left);
    }
    //Sum of all values of a Binary Tree
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left)+sum(root.right);

    }
    //Product of All Values of Binary tree
    private static int findProduct(Node root){
        if(root==null) return 1;
        int left = findProduct(root.left);
        int right = findProduct(root.right);
        if(root.val==0) return left*right; // skip[ kr dega ye 0 ko
        else return root.val * left * right;
    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int levels(Node root){
        if(root==null)  return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

}
