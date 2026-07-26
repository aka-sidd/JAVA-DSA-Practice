package DSAJava.Array.ContainsDuplicate;
import java.util.*;
public class AnotherApproach {
    public static boolean CheckDuplicate(int[]arr){
        int n = arr.length;
        Arrays.sort(arr); // Sort the Array
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[]arr = {1,2,3,4};
        int[]arr1 = {1,2,3,2};
        System.out.println(CheckDuplicate(arr));
        System.out.println(CheckDuplicate(arr1));

    }
}

// Here the time complexity is : O(NlogN) due to sorting and Space is O(1) but if i don't want to use Arrays.sort(arr) then i implement my own sorting method...
class MergeSort {
    public static void mergeSort(int[]arr,int low,int high){
        if(low>=high) return;
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[]arr,int low,int mid,int high){
        int[]temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];

            }else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i] = temp[i];
        }
    }
    public static boolean CheckDuplicates(int[]arr){
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[]arr = {1,2,3,4};
        int[]arr1 = {1,2,3,2};
        System.out.println(CheckDuplicates(arr));
        System.out.println(CheckDuplicates(arr1));
    }
}


