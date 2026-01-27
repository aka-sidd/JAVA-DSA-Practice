package CoreJava.BasicsProgramUsingJava;

import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //product of two numbers
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        //product of these two numbers
        int result = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        sc.close();
    }
}
