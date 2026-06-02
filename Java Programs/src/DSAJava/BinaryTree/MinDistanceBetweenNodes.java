package DSAJava.BinaryTree;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class MinDistanceBetweenNodes {
    //approach:- find LCA
     TreeNode lca(TreeNode root,int p,int q){
        if(root==null) return null;
        if(root.val == p || root.val == q){
            return root;
        }
        TreeNode left = lca(root.left,p,q);
        TreeNode right = lca(root.right,p,q);
        if(left!=null && right!=null) return root;
        return left!=null ? left : right;
    }
    //find distance from a node to target
    int findDistance(TreeNode root,int target){
        if(root==null) return -1;
        if(root.val == target) return 0;
        int left = findDistance(root.left,target);
        if(left!=-1){
            return left + 1;
        }
        int right = findDistance(root.right,target);
        if(right!=-1){
            return right+1;
        }
        return -1;
    }
    // main function
     int minDistance(TreeNode root,int p,int q){
        TreeNode lcaNode = lca(root,p,q);
        int d1 = findDistance(lcaNode,p);
        int d2 = findDistance(lcaNode,q);
        return d1+d2;
    }

   public static void main(String[] args) {
           TreeNode root = new TreeNode(1);

           root.left = new TreeNode(2);
           root.right = new TreeNode(3);

           root.left.left = new TreeNode(4);
           root.left.right = new TreeNode(5);

           root.right.right = new TreeNode(6);

           MinDistanceBetweenNodes  obj = new MinDistanceBetweenNodes ();

           int ans = obj.minDistance(root, 4, 6);

           System.out.println("Minimum Distance = " + ans);
       }

    }

