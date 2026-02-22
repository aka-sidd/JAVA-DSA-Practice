package RecursionBootCamp;

public class Print1toN {
    public static void main(String[] args) {
     Printfunc(5);
    }
    static void Printfunc(int n){
        if(n==0) return;

         Printfunc(n-1);
        System.out.println(n);
    }

}
