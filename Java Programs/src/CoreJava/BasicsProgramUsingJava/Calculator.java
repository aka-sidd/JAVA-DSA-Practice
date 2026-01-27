package CoreJava.BasicsProgramUsingJava;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        //Display operation choices
        System.out.println("Choose an operation");
        System.out.println("1 + (Addition");
        System.out.println("2 - (Subtraction");
        System.out.println("3 / (Division");
        System.out.println("4 * (Multiplication");
        System.out.println("5 % (Modulo");

        int operation = sc.nextInt();
        int result = 0;
        boolean validoperation = true;

        //performing the choosen operation
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
            case 3:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not valid");
                    validoperation = false;
                }
                break;
            case 4:
                result = a * b;
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Modulo by zero is not allowed");
                    validoperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation Selected");
                validoperation = false;
        }
        if (validoperation) {
            System.out.println("The result is: " + result);
        }
        sc.close();
    }
}
