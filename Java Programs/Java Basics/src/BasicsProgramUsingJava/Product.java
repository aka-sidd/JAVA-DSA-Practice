package BasicsProgramUsingJava;

import java.util.*;
public class Product {
    public static int ProductNum(int a,int b){
        int product = (a*b);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = ProductNum(a,b);
        System.out.println("The product of two numbers is: "+product);
    }
}

