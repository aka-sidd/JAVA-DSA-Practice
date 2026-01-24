package DSAJava.Array;
import java.util.Arrays;
public class ArrPrograms {
    public static void main(String[] args) {
        String arr[] ={"Learn","Coding","Siddharth","Pandey"};
        System.out.println("toString"+Arrays.toString(arr));
        System.out.println("asList"+Arrays.asList(arr));
         int arr_1[][] = {{10,20},{30,40}};
        System.out.println("deepToString "+Arrays.deepToString(arr_1));
    }
}
