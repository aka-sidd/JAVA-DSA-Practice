package ArrayPlusHashMap.MissingNumber;

public class MissingNumFrom1toN {
    public static int findMissing(int[]arr){
        int n = arr.length+1; //because one number is missing
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num:arr){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,4,5,6};
        int missing = findMissing(arr);
        System.out.println("Missing Numbers are: " +missing);
    }
}
