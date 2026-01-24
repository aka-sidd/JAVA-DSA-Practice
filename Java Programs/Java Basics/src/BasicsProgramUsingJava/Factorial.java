package BasicsProgramUsingJava;

import java.util.*;
public class Factorial {
    public static void PrintFact(int n) {
        int fact = 1;
        if(n<0){
            System.out.println("Invalid Number");
        }
        //loop
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintFact(n);

    }

}
