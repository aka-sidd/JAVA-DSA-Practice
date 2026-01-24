package DSAJava.Array;
import java.util.Scanner;
public class ArrLength {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Print DSAJava.Array Elements");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("DSAJava.Array Elements");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nDSAJava.Array Length: "+arr.length);
    }
}


