package RecursionBootCamp;
import java.util.ArrayList;
public class FindAllIndices {
    static ArrayList<Integer> findAllIndices(int[]a,int n,int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        //base case
        if(idx>=n){
            return ans; // empty array list
        }
        //self work
        if(a[idx]==target){
            ans.add(idx); // {0}
        }
        //recursive work
        ArrayList<Integer> SmallAns = findAllIndices(a,n,target,idx+1); // {1,2}
        ans.addAll(SmallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[]a = {4,4,2,3,4,5};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = findAllIndices(a,n,target,0);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}
