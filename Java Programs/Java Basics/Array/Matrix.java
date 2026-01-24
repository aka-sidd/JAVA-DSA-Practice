import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input the size of matrix
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int matrix[][] = new int [rows][cols];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }

      
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);

        sc.close();
    }
}







