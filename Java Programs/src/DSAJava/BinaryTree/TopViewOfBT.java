package DSAJava.BinaryTree;
import java.util.*;
class Pairs {
    TreeNode node;
    int col;
    Pairs(TreeNode node,int col){
        this.node = node;
        this.col = col;
    }
}
public class TopViewOfBT {
     static ArrayList<Integer> TopView(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pairs> q = new LinkedList<>();
        q.offer(new Pairs(root,0));
        while(!q.isEmpty()){
            Pairs p = q.poll();
            TreeNode node = p.node;
            int col = p.col;
            if(!map.containsKey(col)) {
                map.put(col,node.val);
            }
                if(node.left!=null){
                    q.offer(new Pairs(node.left,col-1));
                }
                if(node.right!=null){
                    q.offer(new Pairs(node.right,col+1));
                }

            }
         ans.addAll(map.values());
         return ans;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(TopView(root));
    }
}
