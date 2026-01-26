package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println("Hi");
            int j = 1;
            while(j<=3){
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}
