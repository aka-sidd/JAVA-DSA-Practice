package RecursionBootCamp;

public class LinearSearch {
    static boolean findElement(int[]arr,int n,int target,int idx){
        //base case
        if(idx>=n){
            return false;
        }
        // Self work
        if(arr[idx]==target){
            return true;
        }
        //recursive work
        return findElement(arr,n,target,idx+1);

    }
    static int findIndex(int[]arr,int n,int target,int idx){
        //base case
        if(idx>=n) return -1;
        //self work
        if(arr[idx]==target) return idx;
        //recursive work
        return findIndex(arr,n,target,idx+1);
    }
    static void findAllIndices(int[]arr,int n,int target,int idx){
        //base case
        if(idx>=n) return;
        // self work
        if(arr[idx]==target){
            System.out.println(idx);
        }
        // recursive work
        findAllIndices(arr,n,target,idx+1);
    }
    public static void main(String[] args) {
        int[]arr = {2,4,4,4,6,8};
        findAllIndices(arr,arr.length,4,0);

     //   System.out.println(findIndex(arr,arr.length,6,0));
//        if(findElement(arr,arr.length,target,0)){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("No");
//        }

    }
}
