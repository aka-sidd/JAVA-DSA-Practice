package ArrayPlusHashMap;

public class MaxCircularSubArraySum {
 //   public int maxCircularSum(int[]arr){
      //  int n = arr.length;
    //    int maxSum = Integer.MIN_VALUE;
   //     for(int i=0;i<n;i++){
//            for(int len = 1;len<=n;len++){
//                int sum = 0;
//                for(int k=0;k<len;k++){
//                    sum+=arr[(i+k)%n];
//                }
//                maxSum = Math.max(maxSum,sum);
//            }
//        }
//        return maxSum;
 //   }
//
// Here above soln is brute force because the idea is start at every index take the next n elements in Circular Manner and find sum of each possible subarray
//Time Complexity: O(N^3)(Too Slow)
//Space: o(1)

//Better Approach
//Idea:
//(1) Start at every index
//(2) Maintain a running sum
//(3) Take only max n elements
 public int maxCircularSum(int[]arr){
     int n = arr.length;
     int maxSum = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
         int currSum = 0;
         for(int j=0;j<n;j++){
             currSum += arr[(i+j)%n];
             maxSum = Math.max(maxSum,currSum);
         }
     }
     return maxSum;
 }
}
//Here the time complexity of this code is : O(N^2)
//Better but still slow


