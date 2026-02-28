package CoreJava.BasicsProgramUsingJava;

import java.util.Scanner;

public class FindGCD {
    static int findgcd(int x,int y){
        if(y==0){
            return x;
        }
        return findgcd(y,x%y);
    }
    static int GCD(int x,int y){
        while(x%y!=0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x,y));
        System.out.println(findgcd(x,y));
    }
}
