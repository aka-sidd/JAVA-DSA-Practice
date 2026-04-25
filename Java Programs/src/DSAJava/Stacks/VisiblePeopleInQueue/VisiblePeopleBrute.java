package DSAJava.Stacks.VisiblePeopleInQueue;
import java.util.*;
public class VisiblePeopleBrute {
    public int[] VisibleBrute(int[]heights){
        int n = heights.length;
        int[]ans = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            int maxBetween = 0;
            for(int j=i+1;j<n;j++){
                if(Math.min(heights[i],heights[j])>maxBetween){
                    count++;
                }
                maxBetween = Math.max(maxBetween,heights[j]);

                // blocker
                if(heights[j]>heights[i]) break;
            }
            ans[i] = count;

        }
        return ans;
    }
    public static void main(String[] args) {
        VisiblePeopleBrute obj = new VisiblePeopleBrute();
        int[]heights = {10,6,8,5,11,9};
        int[]result = obj.VisibleBrute(heights);
        System.out.println(Arrays.toString(result));

    }
}
