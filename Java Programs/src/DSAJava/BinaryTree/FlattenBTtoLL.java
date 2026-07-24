package DSAJava.BinaryTree;
import java.util.*;
public class FlattenBTtoLL {
     static void flatten(Node root){
        ArrayList<Node> ans = new ArrayList<>();
        dfs(root,ans);
        for(int i=0;i< ans.size()-1;i++){
            Node a = ans.get(i);
            Node b = ans.get(i+1);
            a.right = b;
            a.left = null;
        }
        Node last = ans.getLast();
        last.left = null;
        last.right = null;
    }

    private static void dfs(Node root, ArrayList<Node> ans) {
         if(root==null) return;
         ans.add(root);
         dfs(root.left,ans);
         dfs(root.right,ans);
    }



    }



