package CoreJava.BasicsProgramUsingJava;

import java.util.Scanner;
public class Divides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        double num1 = sc.nextDouble();
        System.out.println("Enter Denominator: ");
        double num2 = sc.nextDouble();
        //check for division by zero
        if(num2==0){
            System.out.println("Cannot divides by zero");
        }else{
            double result = num1/num2;
            System.out.println("The result of "+num1+ " and " +num2+ " is: "+result);
            sc.close();
        }

    }
}
