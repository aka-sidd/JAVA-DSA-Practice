package ArrayPlusHashMap.MajorityElements;

public class MajorityElementOccursNby2 {
    public static int majorityElement(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        if(ans!=-1){
            System.out.println("Majority Element is: " +ans);
        }else{
            System.out.println("No elements exists");
        }
    }
}
