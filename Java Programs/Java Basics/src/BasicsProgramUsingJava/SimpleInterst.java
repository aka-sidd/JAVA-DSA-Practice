package BasicsProgramUsingJava;

import java.util.Scanner;
public class SimpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter time: ");
        float t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Principle: " + p);
        System.out.println("rate: " + r);
        System.out.println("time: " + t);
        System.out.println("Simple interest: "+si);
    }

    }
