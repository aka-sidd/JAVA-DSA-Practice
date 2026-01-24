package BasicsProgramUsingJava;

import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter DSAJava.Array Size: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        //Taking input
        System.out.println("Enter DSAJava.Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Print sum
        int sum = 0;
        for(int i = 0;i<n;i++) {
            sum += arr[i];
        }
        System.out.print("Sum of all element is: "+sum);


    }
}

