package DSAJava.HashMap;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int intersection(int[]arr1,int[]arr2){
        int count = 0;
        HashSet<Integer>set = new HashSet<>(); // arr1 store
        HashSet<Integer>result = new HashSet<>(); // for storing common elements
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                result.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.println("Intersection of elements: " + result);
        return count;
    }
    public static void main(String[] args) {
        int[]arr1 = {7,3,9};
        int[]arr2 = {6,3,9,2,9,4};
        System.out.println(intersection(arr1,arr2));
    }
}
