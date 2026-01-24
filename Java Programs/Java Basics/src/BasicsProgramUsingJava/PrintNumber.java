package BasicsProgramUsingJava;

public class PrintNumber {
    static void PrintNum(int n){
        if(n>0){
            PrintNum(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        PrintNum(n);
    }
}
