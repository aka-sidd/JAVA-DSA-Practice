package RecursionBootCamp;

public class SumOfDigit {
    public static void main(String[] args) {
        int ans = findSum(1342);
        System.out.println(ans);
    }
    static int findSum(int n){
        if(n==0) {
            return 0;
        }
        return (n%10)+findSum(n/10);
    }
}
