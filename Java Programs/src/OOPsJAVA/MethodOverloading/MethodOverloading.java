package OOPsJAVA.MethodOverloading;

public class MethodOverloading {
    public static int add(int a,int b){
        return a + b;
    }
    public static int add(int a,int b,int c){
        return a + b + c;
    }
    public static double add(double a,int b){
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(3,4,5));
        System.out.println(add(2.4,6));

    }
}
