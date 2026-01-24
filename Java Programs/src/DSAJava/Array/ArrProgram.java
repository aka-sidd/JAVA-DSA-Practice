 //Print DSAJava.Array Elements in reverse order/
package DSAJava.Array;
import java.util.Scanner;
        public class ArrProgram {
            public static void main(String[] args) {
                int arr[]= new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter elements of array");
                for(int i=0;i<5;i++){
                    arr[i]=sc.nextInt();

                }
                System.out.println("DSAJava.Array Elements");
                for(int i=5-1;i>=0;i--){
                    System.out.print(arr[i]+" ");
                }
            }
        }
//        int arr[] = {10, 20, 30, 40, 50};
//        for(int i = 5- 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}



//        int arr[] = {10, 20, 30, 40, 50};
//        for(int i = 5- 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

