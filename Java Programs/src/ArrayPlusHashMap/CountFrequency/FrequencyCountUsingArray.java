//Frequency count using Array (In this code we use visited[] array jiski time complexity 0(n^2) and space complexity bhi 0(n) hogi jo achi nhi hai..

package ArrayPlusHashMap.CountFrequency;

public class FrequencyCountUsingArray {
    public static void main(String[] args) {
        int[]arr = {2,3,2,5,3,2,4};
        int n = arr.length;
        boolean visited[] = new boolean[n];//mark visited value
        for(int i=0;i<n;i++){
            if(visited[i]==true) //already count before
                continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }

    }
}
