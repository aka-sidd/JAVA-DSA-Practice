package OOPsJAVA;

public class SumoffirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(SumOfNNatural(10));
    }
    public static int SumOfNNatural(int n){
        if(n==1){
            return 1;
        }
        return n + SumOfNNatural(n-1);
    }
}
