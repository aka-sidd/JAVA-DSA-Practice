package BasicsProgramUsingJava;

//import java.util.Scanner;
public class FIndRemainder {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //Input two integer
//        System.out.println("ENter dividend: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter divisor: ");
//        int num2 = sc.nextInt();
//
//        if(num2==0){
//            System.out.println("Cannot divided by zero");
//        }else{
//            int remainder = num1%num2;
//            System.out.println("Remainder: "+remainder);
//        }
//        sc.close();
        int num1 = 29;
        int num2 = 7;
        if(num2==0){
            System.out.println("Cannot divide by zero");
        }else{
            int remainder = num1%num2;
            System.out.println("The reaminder when "+num1+ "is divided by"+num2+ "is "+remainder);
        }
    }
}

