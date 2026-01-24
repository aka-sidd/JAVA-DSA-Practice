//Brute force

import java.util.Scanner;
public class RectangleSum {
    static int findSum(int[][]matrix,int l1,int r1,int l2,int r2){
        int sum = 0;
        for(int i=l1;i<=l2;i++){
            for(int j = r1 ;j<=r2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
    }
}
