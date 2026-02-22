package RecursionBootCamp;

public class FindFactorial {
    public static void main(String[] args) {
        int ans = findFact(5);
        System.out.println(ans);
    }
    static int findFact(int n){
        if(n<=1) {
            return 1;
        }
        return n*findFact(n-1);
    }
}
