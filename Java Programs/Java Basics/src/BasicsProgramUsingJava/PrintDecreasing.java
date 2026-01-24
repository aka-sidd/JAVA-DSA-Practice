package BasicsProgramUsingJava;//WAP to print the natural numbers from n to 1...
import java.util.Scanner;
public class PrintDecreasing {
    static void printDecreasing(int n){ // 5,4,3,2,1
        //identify the base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //Self work
        System.out.println(n);

        //Recursive work
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
