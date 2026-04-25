package DSAJava.Stacks.VisiblePeopleInQueue;
import java.util.*;
public class VisiblePeople {
    public int[] NumberOfVisiblePeople(int[]heights){
        int n = heights.length;
        int[]ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(!st.isEmpty() && st.peek()<heights[i]){
                st.pop();
                count++;
            }
            if(!st.isEmpty()) count++;
            ans[i] = count;
            st.push(heights[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        VisiblePeople obj = new VisiblePeople();
        int[]heights = {10,6,8,5,11,9};
        int[]result = obj.NumberOfVisiblePeople(heights);
        System.out.println(Arrays.toString(result));

    }
}
