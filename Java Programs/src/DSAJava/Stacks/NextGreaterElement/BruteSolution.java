package DSAJava.Stacks.NextGreaterElement;
import java.util.*;
public class BruteSolution {
    public ArrayList<Integer> findNextGreater(int[]arr) {
        int n = arr.length;
        ArrayList<Integer>ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }
            ans.add(next);
        }
        return ans;
    }
    public static void main(String[] args) {
        BruteSolution obj = new BruteSolution();
        int[]arr = {4,5,2,8,9};
        ArrayList<Integer>result = obj.findNextGreater(arr);
        System.out.println(result);
    }
}
