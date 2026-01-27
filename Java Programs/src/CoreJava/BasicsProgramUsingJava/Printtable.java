package CoreJava.BasicsProgramUsingJava;

import java.util.*;
public class Printtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            if(n%2==0){
                System.out.println(n);
            }
            System.out.println(i);
//            System.out.println(n * i);
        }
    }

}
