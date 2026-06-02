package DSAJava.BinaryTree;

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
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
        //  -1 1 4 6

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(4);
        Node g = new Node(6);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        System.out.println("Level Order (Kth Level Method):");
        for (int i = 0; i < levels(a); i++) {
            KthLevel(a, 0, i);
            System.out.println();
        }

        System.out.print("Preorder Traversal: ");
        display(a);
        System.out.println();

        System.out.println("Size of Binary Tree: " + size(a));
        System.out.println("Sum of Binary Tree: " + sum(a));
        System.out.println("Product of Binary Tree: " + findProduct(a));
        System.out.println("Maximum Value: " + max(a));
        System.out.println("Levels: " + levels(a));

        System.out.println("\nRoot to Leaf Paths:");
        Implementation obj = new Implementation();
        System.out.println(obj.Path(a));
    }

    private static void KthLevel(Node root, int level, int k) {
        if (root == null) return;

        if (level == k) {
            System.out.print(root.val + " ");
        }

        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
    }

    private static void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node front = q.poll();

            System.out.print(front.val + " ");

            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }

        System.out.println();
    }

    private static int size(Node root) {
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }

    private static void display(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int sum(Node root) {
        if (root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    private static int findProduct(Node root) {
        if (root == null) return 1;

        int left = findProduct(root.left);
        int right = findProduct(root.right);

        if (root.val == 0) return left * right;

        return root.val * left * right;
    }

    private static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.val,
                Math.max(max(root.left), max(root.right)));
    }

    private static int levels(Node root) {
        if (root == null) return 0;

        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    // Root to Leaf Paths

    public ArrayList<ArrayList<Integer>> Path(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        dfs(root, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(Node root,
                     ArrayList<Integer> arr,
                     ArrayList<ArrayList<Integer>> ans) {

        if (root == null) return;

        arr.add(root.val);

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size() - 1);
            return;
        }

        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);

        arr.remove(arr.size() - 1);
    }
}