package RecursionBootCamp;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(6);
    }
    static int findfibo(int n){
        //base case
        if(n<2){
            return n;
        }
        return findfibo(n-1)+findfibo(n-2);
    }
}
