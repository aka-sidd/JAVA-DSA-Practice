package OOPsJAVA;

public class Swap {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Before Swap");
        System.out.println("a = " + a + " b = "+b);
//        //Swap a and b using temp variable
//        int temp = a;
//        a = b;
//        b = temp;
       System.out.println("After Swap");
//        System.out.println("a = " + a + " b = "+b);

//without using third variable
        a = a + b; // a = 5;
        b = a - b;  // 5-3 = 2;
        a = a - b; // 5-2 = 3;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    }