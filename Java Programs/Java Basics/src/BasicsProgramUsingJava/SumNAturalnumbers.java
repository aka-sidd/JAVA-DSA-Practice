package BasicsProgramUsingJava;

import java.util.Scanner;
public class SumNAturalnumbers {
  static int findSum(int n){
      if(n==0){
          return 0;
      }
      //recursive case
      return n + findSum(n-1);
  }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        System.out.print("The sum of the natural number is: "+ findSum(n));
        //System.out.println(findSum(n));
    }
}


