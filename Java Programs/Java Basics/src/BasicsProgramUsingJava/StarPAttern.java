package BasicsProgramUsingJava;

import java.util.*;
public class StarPAttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//
        for (int i = 1; i<=n; i++) {
            //inner loop for print spaces...
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
                //inner loop for printing star...
                for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
