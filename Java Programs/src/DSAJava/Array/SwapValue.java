package DSAJava.Array;

public class SwapValue {
    static void SwapWithoutTemp(int a,int b){
        System.out.println("Values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //a = 9 b = 3;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }


    static void swap(int a,int b){

        System.out.println("Values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //a = 9 b = 3;

        int temp = a;
        a = b; // a= 3
        b = temp; // b = 3
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
//        int[]arr = {2,4,3,1,9};
        //swap(a,b);
        SwapWithoutTemp(a,b);


    }
}
