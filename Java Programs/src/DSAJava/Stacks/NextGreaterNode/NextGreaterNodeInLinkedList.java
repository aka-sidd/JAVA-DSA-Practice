package DSAJava.Stacks.NextGreaterNode;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = null;
    }

}
public class NextGreaterNodeInLinkedList {
    public int[] NextGreater(ListNode head){
        List<Integer>list = new ArrayList<>();
        //LinkedList->Array
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int[]ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = 0;
            for(int j=i+1;j<n;j++){
                if(list.get(j)>list.get(i)){
                    ans[i] = list.get(j);
                    break;
                }
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);

        NextGreaterNodeInLinkedList obj = new NextGreaterNodeInLinkedList();
        int[]result = obj.NextGreater(head);
        //Print result
        System.out.println(Arrays.toString(result));

    }
}
