package DSAJava.Array;// Delete an element at the beginning of the array using built in method(remove())...

public class DeletionAtBegin {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40));
//        System.out.println("DSAJava.Array before Deletion");
//        for(int i =0;i<arr.size();i++) {
//            System.out.print(arr.get(i) + " ");
//        }
//            //Remove the first element
//            arr.remove(0);
//            System.out.println("\nArray After Deletion");
//            for(int i =0;i<arr.size();i++){
//                System.out.print(arr.get(i)+" ");
//            }
//        }
//    }
// USing custom method...
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("DSAJava.Array before deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
            //Reduce the size of the array
            n--;
        }
        System.out.println("\nDSAJava.Array after deletion");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}