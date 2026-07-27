package DSAJava.Array.InterSectionOfTwoArrays;
import java.util.*;
public class FindInterSection {
    public static int[] findIntersection(int[]nums1,int[]nums2){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[]visited = new boolean[nums1.length];
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(!visited[j] && nums2[i]==nums1[j]){
                    ans.add(nums2[i]);
                    visited[j] = true;
                    break;
                }
            }
        }
        int[]result = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[]nums1 = {1,2,2,1};
        int[]nums2 = {2,2};
        int[]result = findIntersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
