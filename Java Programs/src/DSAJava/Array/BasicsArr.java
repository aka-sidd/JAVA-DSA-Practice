package DSAJava.Array;
import java.util.*;
public class BasicsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = sc.nextInt();
        //initialize the array...
        int arr[] = new int[n];
        //input array elements
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        //Print array elements with their indices
        System.out.println("DSAJava.Array elements with their indices: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Index" + i + ": "+arr[i]);

        }

    }
}
