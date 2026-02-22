package RecursionBootCamp;

public class ProdOfdigit {
    public static void main(String[] args) {
        int ans = findProd(1342);
        System.out.println(ans);
    }
    static int findProd(int n){
        if(n%10==n) {
            return n;
        }
        return (n%10)*findProd(n/10);
    }
}
