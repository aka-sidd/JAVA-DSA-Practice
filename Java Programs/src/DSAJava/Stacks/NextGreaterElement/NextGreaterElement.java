package DSAJava.Stacks.NextGreaterElement;
import java.util.*;
public class NextGreaterElement {
    public ArrayList<Integer>nextGreater(int[]arr){
        int n = arr.length;
        int[]nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer>st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()) st.pop();
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            ans.add(nge[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();
        int[]arr = {4,5,2,8,9};
        ArrayList<Integer> result = obj.nextGreater(arr);
        System.out.println(result);

    }
}
