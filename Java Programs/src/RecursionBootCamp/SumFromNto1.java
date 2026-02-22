package RecursionBootCamp;

public class SumFromNto1 {
    public static void main(String[] args) {
        int ans = findSum(5);
        System.out.println(ans);
    }
    static int findSum(int n){
        if(n<=1) {
            return 1;
        }
        return n+findSum(n-1);

    }
}
